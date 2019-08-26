package com.stack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class CurrentStock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int currentStockId;
	int stockId;
	double price; 
}
