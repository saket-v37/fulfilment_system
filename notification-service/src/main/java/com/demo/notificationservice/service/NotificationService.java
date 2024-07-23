package com.demo.notificationservice.service;

import com.demo.notificationservice.dto.NotificationRequest;
import com.demo.notificationservice.dto.NotificationResponse;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public NotificationResponse sendNotification(NotificationRequest notificationRequest) {
        // Send notification via email/SMS
        // Return notification response
        return null;
    }

}
