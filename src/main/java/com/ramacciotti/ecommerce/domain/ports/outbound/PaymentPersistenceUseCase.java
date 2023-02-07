package com.ramacciotti.ecommerce.domain.ports.outbound;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Payment;

import java.util.List;

public interface PaymentPersistenceUseCase {

    void saveAll(List<Payment> paymentList);

}
