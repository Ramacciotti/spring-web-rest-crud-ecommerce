package com.ramacciotti.ecommerce.adapter.outbound.persistence;

import com.ramacciotti.ecommerce.adapter.outbound.entity.ClientOrder;
import com.ramacciotti.ecommerce.adapter.outbound.repository.OrderRepository;
import com.ramacciotti.ecommerce.domain.ports.outbound.OrderPersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderPersistence implements OrderPersistenceUseCase {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void saveAll(List<ClientOrder> clientOrderList) {
        orderRepository.saveAll(clientOrderList);
    }

    @Override
    public ClientOrder findOrderById(Long id) {
        return orderRepository.findOrderById(id);
    }

}
