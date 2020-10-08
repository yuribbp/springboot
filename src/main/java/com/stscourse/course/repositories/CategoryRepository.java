package com.stscourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stscourse.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}