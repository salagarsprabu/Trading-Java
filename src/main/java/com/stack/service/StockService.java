package com.stack.service;

import org.springframework.stereotype.Service;

import com.stack.dto.StockResponseDto;

@Service
public interface StockService {

	StockResponseDto getStockList();

}
