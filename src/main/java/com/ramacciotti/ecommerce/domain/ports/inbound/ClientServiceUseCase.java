package com.ramacciotti.ecommerce.domain.ports.inbound;

import com.ramacciotti.ecommerce.domain.dto.rest.ClientResponseDTO;

public interface ClientServiceUseCase {

    ClientResponseDTO getClient(Long id);

}
