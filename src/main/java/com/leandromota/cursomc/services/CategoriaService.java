package com.leandromota.cursomc.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandromota.cursomc.domain.Categoria;
import com.leandromota.cursomc.repositories.CategoriaRepository;
import com.leandromota.cursomc.services.exceptions.ObjetoNaoEncontradoException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj==null) {
			throw new ObjetoNaoEncontradoException("Objeto não encontrado! Id: " 
					+ id + ", Tipo:" + Categoria.class.getName() );
		}
		return obj;
	}
}
