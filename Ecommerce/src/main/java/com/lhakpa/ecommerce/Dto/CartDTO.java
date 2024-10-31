package com.lhakpa.ecommerce.Dto;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity

public class CartDTO {
    private Long id;
    private Long userId;
    private Long productId;
    private int quantity;

}
