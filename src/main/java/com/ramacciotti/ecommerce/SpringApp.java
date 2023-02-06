package com.ramacciotti.ecommerce;

import com.ramacciotti.ecommerce.adapter.outbound.persistence.entity.Category;
import com.ramacciotti.ecommerce.domain.ports.outbound.CategoryPersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringApp implements CommandLineRunner {

    @Autowired
    private CategoryPersistenceUseCase categoryPersistenceUseCase;

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Category category1 = new Category(null, "technology");
        Category category2 = new Category(null, "office");

        categoryPersistenceUseCase.saveAll(Arrays.asList(category1, category2));

    }
}
