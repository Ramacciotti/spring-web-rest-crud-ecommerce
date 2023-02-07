package com.ramacciotti.ecommerce.domain.service;

import com.ramacciotti.ecommerce.adapter.outbound.entity.ClientOrder;
import com.ramacciotti.ecommerce.domain.dto.rest.OrderResponseDTO;
import com.ramacciotti.ecommerce.domain.exception.ItemNotFoundException;
import com.ramacciotti.ecommerce.domain.ports.inbound.OrderServiceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.OrderPersistenceUseCase;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService implements OrderServiceUseCase {

    @Autowired
    OrderPersistenceUseCase orderPersistenceUseCase;


    @Override
    public OrderResponseDTO getOrder(Long id) {

        ClientOrder aClientOrder = orderPersistenceUseCase.findOrderById(id);

        if (aClientOrder == null) {

            throw new ItemNotFoundException("order_not_found");

        } else {

            ModelMapper modelMapper = new ModelMapper();

            return modelMapper.map(aClientOrder, OrderResponseDTO.class);

        }

    }

}
