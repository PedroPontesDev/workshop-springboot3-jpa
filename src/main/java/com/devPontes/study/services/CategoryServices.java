package com.devPontes.study.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devPontes.study.entities.Category;
import com.devPontes.study.repositories.CategoryRepository;

@Service
public class CategoryServices {

	@Autowired
	CategoryRepository repository;

	public List<Category> findAll() {
       return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
