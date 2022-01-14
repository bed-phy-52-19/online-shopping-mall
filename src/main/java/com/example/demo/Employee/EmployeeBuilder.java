package com.example.demo.Employee;


import java.math.BigInteger;

public class EmployeeBuilder {
    private String name;
    private BigInteger phonenumber;
    private String department;
    private String address;
    private String email;
    private Long AccountNumber;

    public Long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Long AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public com.example.demo.Employee.EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public com.example.demo.Employee.EmployeeBuilder setPhonenumber(Long phonenumber) {
        this.phonenumber = BigInteger.valueOf(phonenumber);
        return this;
    }

    public EmployeeBuilder setdepartment(String department) {
        this.department = department;
        return this;
    }

    public com.example.demo.Employee.EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public com.example.demo.Employee.EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Employee createEmployee() {

        return new Employee(name,  phonenumber, department, address, email, AccountNumber);
    }
}
