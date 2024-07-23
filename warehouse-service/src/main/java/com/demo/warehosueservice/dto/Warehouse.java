package com.demo.warehosueservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "warehouses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {

    @Id
    private String id;
    private String name;
    private String location;
    private List<Stock> stock;
}

