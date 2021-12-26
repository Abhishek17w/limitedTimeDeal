package com.abhishek.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhishek.demo.entity.Deal;
import com.abhishek.demo.entity.Seller;
import com.abhishek.demo.repository.DealRepository;
import com.abhishek.demo.repository.SellerRepository;

public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	@Autowired
	private DealRepository dealRepository;
	
	public void createSeller(Seller seller) {
		sellerRepository.save(seller);
	}

	public void createDeal(Deal deal) {
		dealRepository.save(deal);
	}

	public void updateDeal(Deal deal) {
		Deal dealToUpdate = dealRepository.getOne(deal.getId());
		dealToUpdate.setMaxQuantity(deal.getMaxQuantity());
		dealToUpdate.setTimelimit(deal.getTimelimit());
		dealRepository.save(dealToUpdate);
	}

	public void endDeal(Deal deal) {
		Deal dealToUpdate = dealRepository.getOne(deal.getId());
		dealToUpdate.setStatus("Ended");
		dealRepository.save(dealToUpdate);
	}

}
