package com.abhishek.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.demo.entity.Deal;
import com.abhishek.demo.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{{

}
