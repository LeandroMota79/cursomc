package com.leandromota.cursomc.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandromota.cursomc.domain.Cliente;
import com.leandromota.cursomc.repositories.ClienteRepository;
import com.leandromota.cursomc.services.exceptions.ObjetoNaoEncontradoException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if (obj==null) {
			throw new ObjetoNaoEncontradoException("Objeto não encontrado! Id: " 
					+ id + ", Tipo:" + Cliente.class.getName() );
		}
		return obj;
	}
}
