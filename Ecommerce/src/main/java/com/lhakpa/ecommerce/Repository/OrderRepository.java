package com.lhakpa.ecommerce.Repository;

import com.yourcompany.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
