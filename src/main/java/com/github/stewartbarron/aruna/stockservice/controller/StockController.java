package com.github.stewartbarron.aruna.stockservice.controller;

import com.github.stewartbarron.aruna.stockservice.model.Stock;
import com.github.stewartbarron.aruna.stockservice.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {
    private Logger logger = LoggerFactory.getLogger(StockController.class);

    @Autowired
    private StockService stockService;

    @GetMapping("/stocks")
    public List<Stock> getStocks() {
        logger.info("getStocks called");
        return stockService.getStocks();
    }


}
