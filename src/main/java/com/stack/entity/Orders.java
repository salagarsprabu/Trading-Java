package com.stack.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderId;
	int qunatity;
	double totalPrice;
	String orderStatus;
	LocalDate orderDate;
	int stockId;
	int userId;

}
