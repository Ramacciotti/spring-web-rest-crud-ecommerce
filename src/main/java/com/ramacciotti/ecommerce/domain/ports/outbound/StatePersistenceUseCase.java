package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.entity.State;

import java.util.List;

public interface StatePersistenceUseCase {

    void saveAll(List<State> stateList);

}
