package com.devPontes.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devPontes.study.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{}
