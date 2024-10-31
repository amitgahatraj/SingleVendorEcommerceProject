package com.lhakpa.ecommerce.Dto;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity

public class ProductDTO {
    private String name;
    private String description;
    private double price;
    private int quantity;

}

