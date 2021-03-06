package com.example.demo.Customer;



import javax.persistence.*;
import java.math.BigInteger;

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
    private BigInteger phonenumber;
    private String Products;
    private String address;
    private String email;

    public Customer() {
    }

    public Customer( String name,Long phonenumber, String Products, String address, String email) {
        this.name = name;
        this.id = id;
        this.phonenumber = BigInteger.valueOf(phonenumber);
        this.Products = Products;
        this.address = address;
        this.email = email;
    }

    public Customer(String name, BigInteger phonenumber, String Products, String address, String email) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = BigInteger.valueOf(phonenumber);
    }

    public String getProducts() {
        return Products;
    }

    public void setCountry(String country) {
        this.Products = Products;
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
                ", country='" + Products + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

