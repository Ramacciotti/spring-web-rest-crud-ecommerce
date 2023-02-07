package com.ramacciotti.ecommerce;

import com.ramacciotti.ecommerce.adapter.outbound.entity.Address;
import com.ramacciotti.ecommerce.adapter.outbound.entity.Category;
import com.ramacciotti.ecommerce.adapter.outbound.entity.City;
import com.ramacciotti.ecommerce.adapter.outbound.entity.Client;
import com.ramacciotti.ecommerce.adapter.outbound.entity.ClientOrder;
import com.ramacciotti.ecommerce.adapter.outbound.entity.Payment;
import com.ramacciotti.ecommerce.adapter.outbound.entity.PaymentCard;
import com.ramacciotti.ecommerce.adapter.outbound.entity.PaymentSlip;
import com.ramacciotti.ecommerce.adapter.outbound.entity.Product;
import com.ramacciotti.ecommerce.adapter.outbound.entity.State;
import com.ramacciotti.ecommerce.domain.enums.ClientType;
import com.ramacciotti.ecommerce.domain.enums.PaymentStatus;
import com.ramacciotti.ecommerce.domain.ports.outbound.AddressPersistenceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.CategoryPersistenceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.CityPersistenceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.ClientPersistenceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.OrderPersistenceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.PaymentPersistenceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.ProductPersistenceUseCase;
import com.ramacciotti.ecommerce.domain.ports.outbound.StatePersistenceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringApp implements CommandLineRunner {

    @Autowired
    private CategoryPersistenceUseCase categoryPersistenceUseCase;

    @Autowired
    private ProductPersistenceUseCase productPersistenceUseCase;

    @Autowired
    private CityPersistenceUseCase cityPersistenceUseCase;

    @Autowired
    private StatePersistenceUseCase statePersistenceUseCase;

    @Autowired
    private ClientPersistenceUseCase clientPersistenceUseCase;

    @Autowired
    private AddressPersistenceUseCase addressPersistenceUseCase;

    @Autowired
    private OrderPersistenceUseCase orderPersistenceUseCase;

    @Autowired
    private PaymentPersistenceUseCase paymentPersistenceUseCase;


    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Category category1 = new Category().withName("technology");
        Category category2 = new Category().withName("office");

        Product product1 = new Product().withName("computer").withPrice(BigDecimal.valueOf(2000));
        Product product2 = new Product().withName("printer").withPrice(BigDecimal.valueOf(800));
        Product product3 = new Product().withName("mouse").withPrice(BigDecimal.valueOf(100));

        City city1 = new City().withName("São Paulo");
        City city2 = new City().withName("Campinas");
        City city3 = new City().withName("Uberlândia");

        State state1 = new State().withName("São Paulo");
        State state2 = new State().withName("Minas Gerais");

        Client client1 = new Client().withName("Maria Silva").withEmail("maria@gmail.com").withCpfOrCpnj("36378912377").withClientType(ClientType.NATURALPERSON).withPhones(Set.of("1234567819", "9876543213"));

        Address address1 = new Address().withPublicArea("Rua Flores").withNeighborhood("Jardim").withNumber("300").withComplement("Apto 303").withCep("38220834").withClient(client1).withCity(city3);
        Address address2 = new Address().withPublicArea("Avenida Matos").withNeighborhood("Centro").withNumber("105").withComplement("Sala 800").withCep("38777012").withClient(client1).withCity(city1);

        ClientOrder clientOrder1 = new ClientOrder().withDate(generateDate("30/09/2017")).withClient(client1).withAddress(address1);
        ClientOrder clientOrder2 = new ClientOrder().withDate(generateDate("10/10/2017")).withClient(client1).withAddress(address2);

        Payment payment1 = new PaymentCard(null, PaymentStatus.SETTLED, clientOrder1, 6);
        Payment payment2 = new PaymentSlip(null, PaymentStatus.PENDANT, clientOrder2, generateDate("20/10/2017"), null);



        category1.setProducts(List.of(product1, product2, product3));
        category2.setProducts(List.of(product2));

        product1.setCategories(List.of(category1));
        product2.setCategories(List.of(category1, category2));
        product3.setCategories(List.of(category1));

        state1.setCities(List.of(city1, city2));
        state2.setCities(List.of(city3));

        client1.setAddresses(List.of(address1, address2));

        clientOrder1.setPayment(payment1);
        clientOrder1.setProducts(List.of(product1, product3));

        clientOrder2.setPayment(payment2);
        clientOrder2.setProducts(List.of(product2));


        categoryPersistenceUseCase.saveAll(List.of(category1, category2));
        productPersistenceUseCase.saveAll(List.of(product1, product2, product3));
        cityPersistenceUseCase.saveAll(List.of(city1, city2, city3));
        statePersistenceUseCase.saveAll(List.of(state1, state2));
        clientPersistenceUseCase.saveAll(List.of(client1));
        addressPersistenceUseCase.saveAll(List.of(address1, address2));
        orderPersistenceUseCase.saveAll(List.of(clientOrder1, clientOrder2));
        paymentPersistenceUseCase.saveAll(List.of(payment1, payment2));

    }

    private static LocalDate generateDate(String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);

    }

}
