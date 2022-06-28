package com.eduardopucinelli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardopucinelli.course.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	// default implementation by JpaRepository.

}
