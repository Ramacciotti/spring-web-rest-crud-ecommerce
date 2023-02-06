package com.ramacciotti.ecommerce.adapter.outbound.persistence.repository;

import com.ramacciotti.ecommerce.adapter.outbound.persistence.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {

    Category findEmployeeByName(String name);

}