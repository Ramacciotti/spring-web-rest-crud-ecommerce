package com.ramacciotti.ecommerce.adapter.outbound.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@With
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_product")
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column
    private BigDecimal price;

    @ManyToMany
    @JsonBackReference // omite a lista de categorias para cada produto
    @JoinTable( // define quem vai ser a tabela que vai fazer a relação N:N no banco
            name = "table_product_category", // nome da tabela que ficará no meio dessa ligação N:N
            joinColumns = @JoinColumn(name = "product_id"), // qual é a chave estrangeira correspondente ao produto
            inverseJoinColumns = @JoinColumn(name = "category_id") // qual é a chave estrangeira correspondente a categoria
    )
    private List<Category> categories = new ArrayList<>();

}
