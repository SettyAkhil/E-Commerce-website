package com.Akhil.ecom_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Akhil.ecom_project.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    list<Product>
}
