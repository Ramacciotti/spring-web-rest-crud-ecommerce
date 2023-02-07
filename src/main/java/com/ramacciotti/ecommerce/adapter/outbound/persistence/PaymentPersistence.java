package com.ramacciotti.ecommerce.adapter.outbound.persistence;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Payment;
import com.ramacciotti.ecommerce.adapter.outbound.repository.PaymentRepository;
import com.ramacciotti.ecommerce.domain.ports.outbound.PaymentPersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentPersistence implements PaymentPersistenceUseCase {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public void saveAll(List<Payment> paymentList) {
        paymentRepository.saveAll(paymentList);
    }

}
