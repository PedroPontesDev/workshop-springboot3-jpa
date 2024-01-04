package com.devPontes.study.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devPontes.study.entities.Order;
import com.devPontes.study.repositories.OrderRepository;

@Service
public class OrderServices {

	@Autowired
	OrderRepository repository;

	public List<Order> findAll() {
       return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
