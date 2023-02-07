package com.ramacciotti.ecommerce.adapter.outbound.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "city")
public class City implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "client_id")
    private Address address;

}
