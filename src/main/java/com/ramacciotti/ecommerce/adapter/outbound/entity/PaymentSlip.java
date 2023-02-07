package com.ramacciotti.ecommerce.adapter.outbound.entity;

import com.ramacciotti.ecommerce.domain.enums.PaymentStatus;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.time.LocalDate;

@NoArgsConstructor
@Entity
public class PaymentSlip extends Payment {

    @Serial
    private static final long serialVersionUID = 1L;

    private LocalDate dueDate;

    private LocalDate paymentDate;

    public PaymentSlip(Long id, PaymentStatus status, ClientOrder aClientOrder, LocalDate dueDate, LocalDate paymentDate) {
        super(id, status, aClientOrder);
        this.paymentDate = paymentDate;
        this.dueDate = dueDate;
    }

}
