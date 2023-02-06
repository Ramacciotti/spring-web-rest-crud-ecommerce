package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.persistence.entity.Category;

public interface CategoryPersistenceUseCase {

    void save(Category category);

    Category findCategoryByName(String name);

}
