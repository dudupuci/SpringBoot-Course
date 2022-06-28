package com.eduardopucinelli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardopucinelli.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	// default implementation by JpaRepository.

}
