package com.example.demo.Customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Configuration

public class CustomerConfig {

    @Bean

        CommandLineRunner commandLineRunner(CustomerRepository repository){
        return args -> {
        Customer chisomo = new Customer ("chisomo", (long) 1233322323, "clothes", "mbayan", "@cc.ac.mw");
            Customer mphatso =new Customer ("chisomo", 88372811111L, "shoes", "mbayan", "@cc.ac.mw");
            repository.toString();
        };
        }
    }
