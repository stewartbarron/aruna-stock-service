package com.github.stewartbarron.aruna.stockservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stock {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ric;

    @Column(name="bb_code")
    private String bbCode;

    private BigDecimal price;
    private BigDecimal arrival;

    @Column(name="min_price")
    private BigDecimal minPrice;

    @Column(name="max_price")
    private BigDecimal maxPrice;
}
