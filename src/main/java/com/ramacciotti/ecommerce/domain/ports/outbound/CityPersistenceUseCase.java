package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.entity.City;

import java.util.List;

public interface CityPersistenceUseCase {

    void save(City product);

    void saveAll(List<City> asList);

}
