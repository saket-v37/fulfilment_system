package com.demo.inventoryservice.dto;

import lombok.Data;

@Data
public class StockLevel {
    private String warehouseId;
    private int quantity;
}
