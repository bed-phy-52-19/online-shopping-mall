package com.example.demo.Customer;

import java.math.BigInteger;

public class CustomerBuilder {
    private String name;
    private BigInteger phonenumber;
    private String Products;
    private String address;
    private String email;


    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setPhonenumber(Long phonenumber) {
        this.phonenumber = BigInteger.valueOf(phonenumber);
        return this;
    }

    public CustomerBuilder setProducts(String Products) {
        this.Products = Products;
        return this;
    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Customer createCustomer() {
        return new Customer(name,  phonenumber, Products, address, email);
    }
}