package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1L, "Laptop", 75000));
        products.add(new Product(2L, "Mobile", 25000));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }
}
