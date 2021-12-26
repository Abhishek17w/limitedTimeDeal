package com.abhishek.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.demo.entity.Deal;
import com.abhishek.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
