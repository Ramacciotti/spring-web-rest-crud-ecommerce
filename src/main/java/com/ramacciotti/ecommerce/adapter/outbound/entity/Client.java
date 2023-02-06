package com.ramacciotti.ecommerce.adapter.outbound.entity;

import com.ramacciotti.ecommerce.domain.enums.ClientType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@With
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_client")
public class Client implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String cpfOrCpnj;

    private ClientType clientType;

    @ElementCollection // entidade fraca
    @CollectionTable(name = "phone") // define nome da entidade a ser criada
    private Set<String> phones = new HashSet<>();

    @OneToMany(mappedBy = "client") // quem foi o atributo que mapeou do outro lado
    private List<Address> addresses = new ArrayList<>();

}
