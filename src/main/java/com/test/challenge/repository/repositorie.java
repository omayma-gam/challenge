package com.test.challenge.repository;

import com.test.challenge.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface repositorie extends JpaRepository<Product,Long> {

    List<Product>findProductByCategory(String category);
    List<Product> findProductByPrice(double maxprice);
    List<Product> findByNameIgnoreCase(String name);
    }

