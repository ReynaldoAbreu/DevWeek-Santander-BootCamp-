package com.bootcamp.bootcamp.mapper;

import com.bootcamp.bootcamp.model.Stock;
import com.bootcamp.bootcamp.model.dto.StockDto;
import org.springframework.stereotype.Component;

@Component
public class StockMapper {
    public Stock toEntity(StockDto dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;


    }

    public StockDto toDto(Stock stock) {
        StockDto dto = new StockDto();
        dto.setId(stock.getId());
        dto.setName(stock.getName());
        dto.setPrice(stock.getPrice());
        dto.setVariation(stock.getVariation());
        dto.setDate(stock.getDate());
        return dto;
    }
}
