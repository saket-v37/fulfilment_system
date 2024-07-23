package com.demo.notificationservice.controller;

import com.demo.notificationservice.dto.NotificationRequest;
import com.demo.notificationservice.dto.NotificationResponse;
import com.demo.notificationservice.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public ResponseEntity<NotificationResponse> sendNotification(@RequestBody NotificationRequest notificationRequest) {
        NotificationResponse notificationResponse = notificationService.sendNotification(notificationRequest);
        return ResponseEntity.ok(notificationResponse);
    }
}