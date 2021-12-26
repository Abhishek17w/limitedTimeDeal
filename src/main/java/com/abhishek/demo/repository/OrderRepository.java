package com.abhishek.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.demo.entity.Deal;
import com.abhishek.demo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
