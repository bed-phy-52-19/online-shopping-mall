package com.example.demo.Customer;

import javax.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_sequence",
    sequenceName = "customer_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "customer_sequance")
    private Long id;
    private String name;
    private int phonenumber;
    private String country;
    private String address;
    private String email;

    public Customer() {
    }

    public Customer(String name, int phonenumber, String country, String address, String email) {
        this.name = name;
        this.id = id;
        this.phonenumber = phonenumber;
        this.country = country;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

