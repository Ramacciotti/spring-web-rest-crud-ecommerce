package com.ramacciotti.ecommerce.adapter.outbound.persistence;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Product;
import com.ramacciotti.ecommerce.adapter.outbound.repository.ProductRepository;
import com.ramacciotti.ecommerce.domain.ports.outbound.ProductPersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductPersistence implements ProductPersistenceUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void saveAll(List<Product> productList) {
        productRepository.saveAll(productList);
    }

}
