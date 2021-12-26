package com.abhishek.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Deal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "seller_id", referencedColumnName = "id")
	private Seller seller;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	private Item item;

	private int timelimit;

	private int maxQuantity;
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String string) {
		this.status = string;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getTimelimit() {
		return timelimit;
	}

	public void setTimelimit(int timelimit) {
		this.timelimit = timelimit;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}
}
