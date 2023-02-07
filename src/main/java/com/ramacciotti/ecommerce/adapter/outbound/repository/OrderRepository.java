package com.ramacciotti.ecommerce.adapter.outbound.repository;

import com.ramacciotti.ecommerce.adapter.outbound.entity.ClientOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<ClientOrder, Long> {

    ClientOrder findOrderById(Long id);

}