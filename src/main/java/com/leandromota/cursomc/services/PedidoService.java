package com.leandromota.cursomc.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandromota.cursomc.domain.Pedido;
import com.leandromota.cursomc.repositories.PedidoRepository;
import com.leandromota.cursomc.services.exceptions.ObjetoNaoEncontradoException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj==null) {
			throw new ObjetoNaoEncontradoException("Objeto não encontrado! Id: " 
					+ id + ", Tipo:" + Pedido.class.getName() );
		}
		return obj;
	}
}
