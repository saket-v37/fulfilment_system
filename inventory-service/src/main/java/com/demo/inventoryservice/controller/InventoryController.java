package com.demo.inventoryservice.controller;

import com.demo.inventoryservice.dto.InventoryRequest;
import com.demo.inventoryservice.dto.InventoryResponse;
import com.demo.inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public ResponseEntity<InventoryResponse> getInventory(@RequestParam String productId) {
        InventoryResponse inventoryResponse = inventoryService.getInventory(productId);
        return ResponseEntity.ok(inventoryResponse);
    }

    @PostMapping("/reserve")
    public ResponseEntity<InventoryResponse> reserveInventory(@RequestBody InventoryRequest inventoryRequest) {
        InventoryResponse inventoryResponse = inventoryService.reserveInventory(inventoryRequest);
        return ResponseEntity.ok(inventoryResponse);
    }
}
