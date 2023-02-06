package com.ramacciotti.ecommerce.adapter.outbound.repository;

import com.ramacciotti.ecommerce.adapter.outbound.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}