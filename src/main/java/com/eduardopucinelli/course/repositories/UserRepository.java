package com.eduardopucinelli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardopucinelli.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	// default implementation by JpaRepository.

}
