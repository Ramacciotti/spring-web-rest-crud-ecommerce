package com.ramacciotti.ecommerce.adapter.outbound.repository;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}