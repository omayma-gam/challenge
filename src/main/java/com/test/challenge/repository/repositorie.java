package com.test.challenge.repository;

import com.test.challenge.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorie extends JpaRepository<Product,Long> {
}
