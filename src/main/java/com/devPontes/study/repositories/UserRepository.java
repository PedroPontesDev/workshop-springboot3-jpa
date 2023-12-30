package com.devPontes.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devPontes.study.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{}
