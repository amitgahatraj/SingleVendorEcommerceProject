package com.lhakpa.ecommerce.Dto;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity

public class OrderDTO {
    private Long id;
    private Long userId;
    private Long productId;
    private int quantity;

    // Constructors, Getters, and Setters
}
