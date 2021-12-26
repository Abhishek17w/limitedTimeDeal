package com.abhishek.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "seller_id", referencedColumnName = "id")
	private Seller Owner;
	
	private String name;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Seller getOwner() {
		return Owner;
	}

	public void setOwner(Seller owner) {
		Owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantityPresent() {
		return quantityPresent;
	}

	public void setQuantityPresent(int quantityPresent) {
		this.quantityPresent = quantityPresent;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	private int quantityPresent;
	
	private String details;
	
}
