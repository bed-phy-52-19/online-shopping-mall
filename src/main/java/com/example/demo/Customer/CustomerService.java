package com.example.demo.Customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    public List<Customer> getCustomer(){
        return List.of(new CustomerBuilder().setName("chisomo").setPhonenumber(68).setCountry("malawi").setAddress("mbayan").setEmail("@cc.ac.mw").createCustomer());
}

    }
