package com.example.demo.Employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Configuration


public class EmployeeConfig {

    private EmployeeRepository repository;
    @Bean
    CommandLineRunner command(EmployeeRepository repository){
        return args -> {
            Employee sadik = new Employee("sadik", (long) 1233322323, "malawi", "mbayan", "@cc.ac.mw", 898989898L);
            Employee sudo = new Employee("sudo", 88372811111L, "malawi", "mbayan", "@cc.ac.mw", 9994445L);
            repository.toString();
        };
    }
}
