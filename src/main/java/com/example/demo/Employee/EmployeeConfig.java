package com.example.demo.Employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration

public class EmployeeConfig {
    @Bean
    CommandLineRunner command(EmployeeRepository repository){
        return args -> {
            Employee sadik = new Employee("sadik", (long) 1233322323, "malawi", "mbayan", "@cc.ac.mw", 898989898L);
            Employee sudo = new Employee("sudo", 88372811111L, "malawi", "mbayan", "@cc.ac.mw", 9994445L);
            repository.saveAll(List.of(sadik,sudo));
        };
    }
}
