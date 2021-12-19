package com.github.stewartbarron.aruna.stockservice.service;

import com.github.stewartbarron.aruna.stockservice.model.Stock;
import com.github.stewartbarron.aruna.stockservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getStocks() {
        return stockRepository.findAll();
    }
}
