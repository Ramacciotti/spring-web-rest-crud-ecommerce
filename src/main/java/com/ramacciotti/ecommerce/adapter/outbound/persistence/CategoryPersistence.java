package com.ramacciotti.ecommerce.adapter.outbound.persistence;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Category;
import com.ramacciotti.ecommerce.adapter.outbound.repository.CategoryRepository;
import com.ramacciotti.ecommerce.domain.ports.outbound.CategoryPersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryPersistence implements CategoryPersistenceUseCase {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category findCategoryByName(String name) {
        return categoryRepository.findCategoryByName(name);
    }

    @Override
    public void saveAll(List<Category> categoryList) {
        categoryRepository.saveAll(categoryList);
    }

    @Override
    public Category findCategoryById(Long id) {
        return categoryRepository.findCategoryById(id);
    }

}
