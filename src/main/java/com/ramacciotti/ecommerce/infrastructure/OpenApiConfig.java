package com.ramacciotti.ecommerce.infrastructure;

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

        Tag clientController = new Tag();
        clientController.setName("Client Controller");

        Tag orderController = new Tag();
        orderController.setName("Order Controller");

        return List.of(categoryController, clientController, orderController);

    }

    private List<Server> servers() {

        Server localServer = new Server();
        localServer.setUrl("http://localhost:8080");

        return List.of(localServer);

    }

}
