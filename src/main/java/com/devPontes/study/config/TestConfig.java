package com.devPontes.study.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devPontes.study.entities.User;
import com.devPontes.study.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Pedro Lopes", "lopes@gmail.com", "977777777", "123456");
		User u2 = new User(null, "Maria Rita", "maria@gmail.com", "988888888", "123456");
		repository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
	
}
