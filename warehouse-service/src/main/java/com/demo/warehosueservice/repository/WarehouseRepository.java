package com.demo.warehosueservice.repository;

import com.demo.warehosueservice.dto.Warehouse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends MongoRepository<Warehouse, String> {
}
