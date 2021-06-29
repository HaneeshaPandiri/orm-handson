package com.cognizant.ormlearn.service;

import java.util.Date;
import java.util.List;

import com.cognizant.ormlearn.model.Stock;

public interface StockService {
	List<Stock> getAllStockDetails();

	List<Stock> findStock(String code);

	List<Stock> findFBStock(String code, Date startDate, Date endDate);

	List<Stock> findGoogleStock(String code, double price);

	List<Stock> findTop3VolStock();

	List<Stock> findLowest3NFLXStock(String code);
}
