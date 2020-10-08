package com.stscourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stscourse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}