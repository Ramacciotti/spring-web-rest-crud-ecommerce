package com.ramacciotti.ecommerce.domain.dto.rest;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CategoryResponseDTO {

    private String name;

    private List<Product> products;

}
