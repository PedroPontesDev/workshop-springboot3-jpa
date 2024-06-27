package com.devPontes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devPontes.course.entities.OrderItem;
import com.devPontes.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
