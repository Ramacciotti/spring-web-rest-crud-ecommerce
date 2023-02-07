package com.ramacciotti.ecommerce.domain.dto.rest;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class OrderResponseDTO {

    private String name;

    private Set<String> phones;

    private List<Address> addresses;

}
