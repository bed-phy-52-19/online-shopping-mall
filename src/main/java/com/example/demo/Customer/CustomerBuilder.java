package com.example.demo.Customer;

public class CustomerBuilder {
    private String name;
    private int phonenumber;
    private String country;
    private String address;
    private String email;

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public CustomerBuilder setCountry(String country) {
        this.country = country;
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
        return new Customer(name, phonenumber, country, address, email);
    }
}