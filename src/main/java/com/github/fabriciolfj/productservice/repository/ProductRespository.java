package com.github.fabriciolfj.productservice.repository;

import com.github.fabriciolfj.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Long> {
}
