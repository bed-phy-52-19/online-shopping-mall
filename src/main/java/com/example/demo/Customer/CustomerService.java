package com.example.demo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Autowired
    public List<Customer> getCustomer(){
        return customerRepository.findAll();
}

    public void addNewCustomer(Customer customer) {
        System.out.println(customer);
    }
}
