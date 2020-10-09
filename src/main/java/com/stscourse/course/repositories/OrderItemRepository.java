package com.stscourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stscourse.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}