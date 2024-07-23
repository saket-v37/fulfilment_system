package com.demo.warehosueservice.controller;

import com.demo.warehosueservice.dto.FulfillOrderRequest;
import com.demo.warehosueservice.dto.WarehouseResponse;
import com.demo.warehosueservice.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @PostMapping("/fulfill")
    public ResponseEntity<WarehouseResponse> fulfillOrder(@RequestBody FulfillOrderRequest fulfillOrderRequest) {
        WarehouseResponse warehouseResponse = warehouseService.fulfillOrder(fulfillOrderRequest);
        return ResponseEntity.ok(warehouseResponse);
    }

}
