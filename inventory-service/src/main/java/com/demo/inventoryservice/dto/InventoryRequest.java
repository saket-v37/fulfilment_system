package com.demo.inventoryservice.dto;

import lombok.Data;

@Data
public class InventoryRequest {
    private String productId;
    private String warehouseId;
    private int quantity;
}
