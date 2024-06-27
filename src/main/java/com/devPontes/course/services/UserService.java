package com.devPontes.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.devPontes.course.entities.User;
import com.devPontes.course.repositories.UserRepository;
import com.devPontes.course.services.exceptions.DatabaseException;
import com.devPontes.course.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		var entity = repository.findById(id);
		if(entity.isPresent()) {
			repository.delete(entity.get());
		}
	}
	
	
	public User update(Long id, User user) {
		var entity = repository.findById(id);
		if(entity.isPresent()) {
			entity.get();
			var update = entity.get();
			update.setPhone(user.getPhone());
			update.setName(user.getName());
			update.setPassword(user.getPassword());
			update.setEmail(user.getEmail());
			return update;
		} throw new ResourceNotFoundException(id);
	}
}
