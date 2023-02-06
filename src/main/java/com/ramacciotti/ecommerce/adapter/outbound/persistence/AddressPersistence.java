package com.ramacciotti.ecommerce.adapter.outbound.persistence;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Address;
import com.ramacciotti.ecommerce.adapter.outbound.repository.AddressRepository;
import com.ramacciotti.ecommerce.domain.ports.outbound.AddressPersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressPersistence implements AddressPersistenceUseCase {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void saveAll(List<Address> addressList) {
        addressRepository.saveAll(addressList);
    }

}
