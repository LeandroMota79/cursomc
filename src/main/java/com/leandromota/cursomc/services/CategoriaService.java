package com.leandromota.cursomc.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandromota.cursomc.domain.Categoria;
import com.leandromota.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = ((CategoriaRepository) repo).findOne(id);
		return obj;
	}
}
