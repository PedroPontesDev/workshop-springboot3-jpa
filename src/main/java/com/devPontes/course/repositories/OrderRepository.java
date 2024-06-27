package com.devPontes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devPontes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
