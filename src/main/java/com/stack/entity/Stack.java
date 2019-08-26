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
public class Stack {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int stackId;
	String stackName;
	double unitPrice;
	LocalDate stockCreatedOn;
	int criselRating;
	
}
