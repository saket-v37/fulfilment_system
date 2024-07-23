package com.demo.notificationservice.dto;

import lombok.Data;

@Data
public class NotificationRequest {
    private String orderId;
    private String message;
}
