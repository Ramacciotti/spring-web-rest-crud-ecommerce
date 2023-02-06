package com.ramacciotti.ecommerce.domain.ports.inbound;

import com.ramacciotti.ecommerce.domain.dto.rest.CategoryRequestDTO;
import com.ramacciotti.ecommerce.domain.dto.rest.CategoryResponseDTO;

public interface CategoryServiceUseCase {

    CategoryResponseDTO postCategory(CategoryRequestDTO categoryRequestDTO);

}
