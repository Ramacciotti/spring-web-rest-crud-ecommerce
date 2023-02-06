package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Client;

import java.util.List;

public interface ClientPersistenceUseCase {

    void saveAll(List<Client> clientList);

}
