package com.ramacciotti.ecommerce.adapter.outbound.repository;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findCategoryByName(String name);

}