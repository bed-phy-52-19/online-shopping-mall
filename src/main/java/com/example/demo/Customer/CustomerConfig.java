package com.example.demo.Customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration

public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
        return args -> {
        Customer chisomo =  (new CustomerBuilder().setName("chisomo").setPhonenumber(67).setCountry("malawi").setAddress("mbayan").setEmail("@cc.ac.mw").createCustomer());
            Customer mphatso =(new CustomerBuilder().setName("mphatso").setPhonenumber(78).setCountry("malawi").setAddress("ndilande").setEmail("@cc.ac.mw").createCustomer());
            repository.saveAll(List.of(chisomo,mphatso));
        };
    }
}
