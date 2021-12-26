package com.abhishek.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abhishek.demo.entity.Deal;

public interface DealRepository extends JpaRepository<Deal, Long>{

	@Query("select d from Deal d where d.sellerId = ?1 ")
	Deal findIfDealIsPossibleOrNot(Long sellerId,Long userId);
}
