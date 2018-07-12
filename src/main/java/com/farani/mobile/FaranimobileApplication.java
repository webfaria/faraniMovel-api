package com.farani.mobile;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.farani.mobile.domain.Categoria;
import com.farani.mobile.repositories.CategoriaRepository;

@SpringBootApplication
public class FaranimobileApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categorias;

	public static void main(String[] args) {
		SpringApplication.run(FaranimobileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categorias.saveAll(Arrays.asList(cat1, cat2));
		
	}
	
	
}
