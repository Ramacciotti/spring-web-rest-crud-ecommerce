package com.ramacciotti.ecommerce.domain.service;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Client;
import com.ramacciotti.ecommerce.domain.dto.rest.ClientResponseDTO;
import com.ramacciotti.ecommerce.domain.exception.ItemNotFoundException;
import com.ramacciotti.ecommerce.domain.ports.inbound.ClientServiceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.ClientPersistenceUseCase;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClientService implements ClientServiceUseCase {

    @Autowired
    ClientPersistenceUseCase clientPersistenceUseCase;


    @Override
    public ClientResponseDTO getClient(Long id) {

        Client client = clientPersistenceUseCase.findClientById(id);

        if (client == null) {

            throw new ItemNotFoundException("client_not_found");

        } else {

            ModelMapper modelMapper = new ModelMapper();

            return modelMapper.map(client, ClientResponseDTO.class);

        }

    }

}
