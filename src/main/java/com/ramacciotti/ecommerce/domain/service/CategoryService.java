package com.ramacciotti.ecommerce.domain.service;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Category;
import com.ramacciotti.ecommerce.domain.dto.rest.CategoryRequestDTO;
import com.ramacciotti.ecommerce.domain.dto.rest.CategoryResponseDTO;
import com.ramacciotti.ecommerce.domain.ports.inbound.CategoryServiceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.CategoryPersistenceUseCase;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CategoryService implements CategoryServiceUseCase {

    @Autowired
    CategoryPersistenceUseCase categoryPersistenceUseCase;


    @Override
    public CategoryResponseDTO postCategory(CategoryRequestDTO categoryRequestDTO) {

        Category duplicatedCategory = categoryPersistenceUseCase.findCategoryByName(categoryRequestDTO.getName());

        if (duplicatedCategory == null) {

            Category category = new Category()
                    .withName(categoryRequestDTO.getName());

            categoryPersistenceUseCase.save(category);

            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(category, CategoryResponseDTO.class);

        } else {

            throw new RuntimeException("category_name_already_registered");

        }

    }

}
