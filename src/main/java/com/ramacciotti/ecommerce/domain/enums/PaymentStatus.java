package com.ramacciotti.ecommerce.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentStatus {

    PENDANT("Pendant"),
    SETTLED("Settled"),
    CANCELED("Canceled");

    private final String description;

}

