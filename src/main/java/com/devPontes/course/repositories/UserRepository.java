package com.devPontes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devPontes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
