package com.ramacciotti.ecommerce.adapter.outbound.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import java.io.Serial;
import java.io.Serializable;

@With
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_address")
public class Address implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String publicArea;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String complement;

    @Column(nullable = false)
    private String neighborhood;

    @Column(nullable = false)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}
