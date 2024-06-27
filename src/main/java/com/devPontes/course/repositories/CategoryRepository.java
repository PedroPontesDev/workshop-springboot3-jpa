package com.devPontes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devPontes.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
