package com.ramacciotti.ecommerce.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClientType {

    NATURALPERSON("Natural Person"),
    LEGALPERSON("Legal Person");

    private final String description;

}
