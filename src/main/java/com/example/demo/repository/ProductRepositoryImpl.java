package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    List<Product> products = new ArrayList<>(List.of(new Product(), new Product(1, "Product One", 12.9)));
//    products

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return products.stream().filter((p) -> p.getId() == id).findAny().get();
    }

    @Override
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }
}
