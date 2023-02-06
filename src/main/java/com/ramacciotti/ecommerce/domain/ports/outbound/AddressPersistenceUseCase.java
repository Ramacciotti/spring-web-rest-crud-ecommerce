package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Address;

import java.util.List;

public interface AddressPersistenceUseCase {

    void saveAll(List<Address> addressList);

}
