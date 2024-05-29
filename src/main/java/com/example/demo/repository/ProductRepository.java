package com.example.demo.repository;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductRepository{
    List<Product> getAllProducts();
    Product getProductById(int id);
    Product addProduct(Product product);
}

