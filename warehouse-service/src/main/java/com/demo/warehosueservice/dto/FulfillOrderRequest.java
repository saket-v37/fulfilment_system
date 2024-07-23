package com.demo.warehosueservice.dto;

import lombok.Data;

@Data
public class FulfillOrderRequest {
    private String orderId;
    private String warehouseId;
}
