package com.lhakpa.ecommerce.Services;

import com.lhakpa.ecommerce.Entity.Order;

import java.util.List;
import java.util.Optional;



public interface OrderService {

    Order createOrder(Order order);

    List<Order> getAllOrder();

    Optional<Order> findById(Long id);

    Optional<Order> findByName(String name);

    Order updateOrder(Order order);

    void deleteOrder(Long id);
}
