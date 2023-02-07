package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.entity.ClientOrder;

import java.util.List;

public interface OrderPersistenceUseCase {

    void saveAll(List<ClientOrder> clientOrderList);

    ClientOrder findOrderById(Long id);

}
