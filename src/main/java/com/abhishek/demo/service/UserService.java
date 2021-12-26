package com.abhishek.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhishek.demo.entity.Deal;
import com.abhishek.demo.entity.Order;
import com.abhishek.demo.entity.Seller;
import com.abhishek.demo.entity.User;
import com.abhishek.demo.repository.DealRepository;
import com.abhishek.demo.repository.UserRepository;

public class UserService {

	@Autowired
    UserRepository userRepository;
	
	@Autowired
	private DealRepository dealRepository;
	
	public void createUser(User user) {
		userRepository.save(user);
	}

	public void claimDeal(Order order) {
		
		Long userId = order.getUser().getId();
		Long sellerId = order.getSeller().getId();
		
		dealRepository.findIfDealIsPossibleOrNot(sellerId,userId);
	}

}
