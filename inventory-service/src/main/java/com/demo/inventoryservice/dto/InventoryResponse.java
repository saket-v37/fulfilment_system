package com.demo.inventoryservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class InventoryResponse {
    private String productId;
    private List<StockLevel> stockLevels;
}
