package com.devPontes.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devPontes.study.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{}
