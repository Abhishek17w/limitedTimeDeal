package com.abhishek.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.demo.entity.Deal;
import com.abhishek.demo.entity.Order;
import com.abhishek.demo.entity.Seller;
import com.abhishek.demo.entity.User;
import com.abhishek.demo.service.SellerService;
import com.abhishek.demo.service.UserService;

@RestController
public class MainController {
	
	@Autowired
    UserService userService;
	
	@Autowired
    SellerService sellerService;
	
	@PostMapping("/createUser")
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}
	
	@PostMapping("/createSeller")
	public void createSeller(@RequestBody Seller seller) {
		sellerService.createSeller(seller);
	}
	
	@PostMapping("/createDeal")
	public void createDeal(@RequestBody Deal deal) {
		sellerService.createDeal(deal);
	}
	
	@PostMapping("/updateDeal")
	public void updateDeal(@RequestBody Deal deal) {
		sellerService.updateDeal(deal);
	}
	
	@PostMapping("/endDeal")
	public void endDeal(@RequestBody Deal deal) {
		sellerService.endDeal(deal);
	}
	
	@PostMapping("/claimDeal")
	public void claimDeal(@RequestBody Order order) {
		userService.claimDeal(order);
	}
}
