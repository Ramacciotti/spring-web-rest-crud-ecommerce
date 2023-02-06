package com.ramacciotti.ecommerce.adapter.outbound.persistence;

import com.ramacciotti.ecommerce.adapter.outbound.entity.State;
import com.ramacciotti.ecommerce.adapter.outbound.repository.StateRepository;
import com.ramacciotti.ecommerce.domain.ports.outbound.StatePersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StatePersistence implements StatePersistenceUseCase {

    @Autowired
    StateRepository productRepository;

    @Override
    public void save(State product) {
        productRepository.save(product);
    }

    @Override
    public void saveAll(List<State> productList) {
        productRepository.saveAll(productList);
    }

}
