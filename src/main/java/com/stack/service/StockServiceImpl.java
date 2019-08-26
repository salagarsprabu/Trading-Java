package com.stack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stack.dto.StockDto;
import com.stack.dto.StockResponseDto;
import com.stack.entity.Stock;
import com.stack.respository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public StockResponseDto getStockList() {
		List<Stock> stockList = stockRepository.findAll();
		List<StockDto> stockDtoList = new ArrayList<>();
		StockResponseDto stockResponseDto = new StockResponseDto();
		for (Stock list : stockList) {
			StockDto stockDto = new StockDto();
			stockDto.setStockId(list.getStockId());
			stockDto.setStockName(list.getStockName());
			stockDto.setUnitPrice(list.getUnitPrice());
			stockDto.setRating(list.getCriselRating());
			stockDtoList.add(stockDto);
		}
		stockResponseDto.setData(stockDtoList);
		stockResponseDto.setMessage("get all stock list");
		stockResponseDto.setStatus("SUCCESS");
		stockResponseDto.setStatusCode(200);
		return stockResponseDto;
	}

}
