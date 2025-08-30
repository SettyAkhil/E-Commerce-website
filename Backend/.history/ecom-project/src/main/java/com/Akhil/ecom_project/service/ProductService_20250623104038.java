package com.Akhil.ecom_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Akhil.ecom_project.model.Product;
import com.Akhil.ecom_project.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }
}
