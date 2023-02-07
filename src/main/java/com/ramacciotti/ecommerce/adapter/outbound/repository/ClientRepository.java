package com.ramacciotti.ecommerce.adapter.outbound.repository;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findClientById(Long id);

}