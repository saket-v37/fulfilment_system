package com.demo.orderservice.dto;

import lombok.Data;

@Data
public class OrderResponse {
    private String orderId;
    private String status;
    private String estimatedDelivery;
}
