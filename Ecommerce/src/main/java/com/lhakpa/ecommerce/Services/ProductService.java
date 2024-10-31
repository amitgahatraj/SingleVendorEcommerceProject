package com.lhakpa.ecommerce.Services;

import com.lhakpa.ecommerce.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Optional<Product> findById(Long id);

    Optional<Product> findByName(String name);

    Product updateProduct(Product product);

    void deleteProduct(Long id);
}
