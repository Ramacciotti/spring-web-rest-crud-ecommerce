package com.ramacciotti.ecommerce.domain.ports.inbound;

import com.ramacciotti.ecommerce.domain.dto.rest.OrderResponseDTO;

public interface OrderServiceUseCase {

    OrderResponseDTO getOrder(Long id);

}
