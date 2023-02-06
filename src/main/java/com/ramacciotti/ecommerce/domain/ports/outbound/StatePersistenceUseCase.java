package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.entity.State;

import java.util.List;

public interface StatePersistenceUseCase {

    void save(State product);

    void saveAll(List<State> asList);

}
