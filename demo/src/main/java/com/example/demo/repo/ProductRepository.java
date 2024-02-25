package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.products.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> 
{
}
