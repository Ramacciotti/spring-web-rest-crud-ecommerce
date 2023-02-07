package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Category;

import java.util.List;

public interface CategoryPersistenceUseCase {

    void saveAll(List<Category> asList);

    Category findCategoryById(Long id);

}
