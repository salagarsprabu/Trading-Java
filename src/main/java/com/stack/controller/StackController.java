package com.stack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stack.dto.OrderResDto;
import com.stack.dto.StockResponseDto;
import com.stack.service.OrderService;
import com.stack.service.StockService;

@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RequestMapping("/api")

public class StackController {


	@Autowired
	StockService stockService;
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/getAllStocks")
	public ResponseEntity<StockResponseDto> stockList(){
		
		return new ResponseEntity<>(stockService.getStockList(), HttpStatus.OK);
	}
	
	@GetMapping("/myOrders/{userId}")
	public ResponseEntity<OrderResDto> getAll(@PathVariable Integer userId){
		
		return new ResponseEntity<>(orderService.getAll(userId),HttpStatus.OK);
	}
	
}
