package com.ramacciotti.ecommerce.infrastructure.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("prod")
@OpenAPIDefinition
public class OpenApiConfig {

    @Value("${info.app.name}")
    private String name;

    @Value("${info.app.version}")
    private String version;

    @Value("${info.app.description}")
    private String description;

    @Bean
    public OpenAPI configure() {
        return new OpenAPI()
                .info(info())
                .servers(servers())
                .tags(tags());
    }

    private Info info() {
        return new Info()
                .title(name)
                .version(version)
                .description(description);
    }

    private List<Tag> tags() {

        Tag categoryController = new Tag();
        categoryController.setName("Category Controller");
        categoryController.setDescription("Save a category in database");

        return List.of(categoryController);

    }

    private List<Server> servers() {

        Server baseServer = new Server();
        baseServer.setUrl("http://localhost:8080");

        return List.of(baseServer);

    }

}
