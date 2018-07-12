package com.farani.mobile.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farani.mobile.domain.Categoria;
import com.farani.mobile.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categorias;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categorias.findById(id);
		return obj.orElse(null);
	}
}
