package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Product;

import java.util.List;

public interface ProductPersistenceUseCase {

    void save(Product product);

    Product findProductByName(String name);

    void saveAll(List<Product> asList);

}
