package com.cognizant.ormlearn.service.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.StockService;


@Service
@Transactional
public class StockServiceImplementaion implements StockService {

	@Autowired
	private StockRepository stockRepo;
	
	@Override
	public List<Stock> getAllStockDetails() {
		return stockRepo.findAll();
	}

	@Override
	public List<Stock> findStock(String code) {

		return stockRepo.findStockByCode(code);
	}

	@Override
	public List<Stock> findFBStock(String code, Date startDate, Date endDate) {

		return stockRepo.fbStockInSep19(code, startDate, endDate);
	}

	@Override
	public List<Stock> findGoogleStock(String code, double price) {

		return stockRepo.googleStocks(code, price);
	}

	@Override
	public List<Stock> findTop3VolStock() {

		return stockRepo.topVolume();
	}

	@Override
	public List<Stock> findLowest3NFLXStock(String code) {
		
		return stockRepo.lowNetflixStocks(code);
	}


}
