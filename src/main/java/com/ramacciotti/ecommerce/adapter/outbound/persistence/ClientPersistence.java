package com.ramacciotti.ecommerce.adapter.outbound.persistence;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Client;
import com.ramacciotti.ecommerce.adapter.outbound.repository.ClientRepository;
import com.ramacciotti.ecommerce.domain.ports.outbound.ClientPersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientPersistence implements ClientPersistenceUseCase {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public void saveAll(List<Client> clientList) {
        clientRepository.saveAll(clientList);
    }

}
