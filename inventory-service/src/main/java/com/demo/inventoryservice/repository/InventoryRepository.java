package com.demo.inventoryservice.repository;

import com.demo.inventoryservice.dto.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, String> {

}
