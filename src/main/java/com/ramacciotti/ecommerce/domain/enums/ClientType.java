package com.ramacciotti.ecommerce.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClientType {

    NaturalPerson("Natural Person"),
    LegalPerson("Legal Person");

    private final String description;

}
