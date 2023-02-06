package com.ramacciotti.ecommerce.adapter.outbound.persistence;

import com.ramacciotti.ecommerce.adapter.outbound.entity.City;
import com.ramacciotti.ecommerce.adapter.outbound.repository.CityRepository;
import com.ramacciotti.ecommerce.domain.ports.outbound.CityPersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityPersistence implements CityPersistenceUseCase {

    @Autowired
    CityRepository productRepository;

    @Override
    public void save(City product) {
        productRepository.save(product);
    }

    @Override
    public void saveAll(List<City> productList) {
        productRepository.saveAll(productList);
    }

}
