package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    Product getProductById(@PathVariable("id") int ID){
        return productService.getProductById(ID);
    }

    @PostMapping
    Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

}