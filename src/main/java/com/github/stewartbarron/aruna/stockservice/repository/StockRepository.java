package com.github.stewartbarron.aruna.stockservice.repository;

import com.github.stewartbarron.aruna.stockservice.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository  extends JpaRepository<Stock, Long> {
}
