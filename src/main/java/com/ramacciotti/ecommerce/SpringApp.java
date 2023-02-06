package com.ramacciotti.ecommerce;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Category;
import com.ramacciotti.ecommerce.adapter.outbound.entity.Product;
import com.ramacciotti.ecommerce.domain.ports.outbound.CategoryPersistenceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.ProductPersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class SpringApp implements CommandLineRunner {

    @Autowired
    private CategoryPersistenceUseCase categoryPersistenceUseCase;

    @Autowired
    private ProductPersistenceUseCase productPersistenceUseCase;

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Criando Categorias e Produtos -------------------------------------------------------------------------

        Category category1 = new Category();
        category1.setName("technology");

        Category category2 = new Category();
        category2.setName("office");

        Product product1 = new Product();
        product1.setName("computer");
        product1.setPrice(BigDecimal.valueOf(2000));

        Product product2 = new Product();
        product2.setName("printer");
        product2.setPrice(BigDecimal.valueOf(800));

        Product product3 = new Product();
        product3.setName("mouse");
        product3.setPrice(BigDecimal.valueOf(100));

        // Associando Produtos a Categorias -------------------------------------------------------------------------

        category1.setProducts(List.of(product1, product2, product3));
        category2.setProducts(List.of(product2));

        // Associando Categorias a Produtos -------------------------------------------------------------------------

        product1.setCategories(List.of(category1));
        product2.setCategories(List.of(category1, category2));
        product3.setCategories(List.of(category1));

        // Salvar itens =======================================================================

        categoryPersistenceUseCase.saveAll(List.of(category1, category2));

        productPersistenceUseCase.saveAll(List.of(product1, product2, product3));

    }
}
