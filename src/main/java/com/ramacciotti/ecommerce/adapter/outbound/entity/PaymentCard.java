package com.ramacciotti.ecommerce.adapter.outbound.entity;

import com.ramacciotti.ecommerce.domain.enums.PaymentStatus;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class PaymentCard extends Payment {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer installmentNumber;

    public PaymentCard(Long id, PaymentStatus status, ClientOrder aClientOrder, Integer installmentNumber) {
        super(id, status, aClientOrder);
        this.installmentNumber = installmentNumber;
    }

}
