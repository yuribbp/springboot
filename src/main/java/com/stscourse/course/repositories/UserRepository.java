package com.stscourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stscourse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}