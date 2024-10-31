package com.lhakpa.ecommerce.Dto;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity

public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String password;

}