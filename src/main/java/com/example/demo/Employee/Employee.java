package com.example.demo.Employee;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table

public class Employee {


        @Id
        @SequenceGenerator(name = "employee_sequence",
                sequenceName = "employee_sequence",
                allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE,
                generator = "employee_sequance")
        private Long id;
        private String name;
        private BigInteger phonenumber;
        private String department;
        private String address;
        private String email;
        private Long AccountNumber;


    public Employee(String name, BigInteger phonenumber, String department, String address, String email, Long AccountNumber) {
        }

        public Employee(String name, Long phonenumber, String department, String address, String email, Long AccountNumber) {
            this.name = name;
            this.id = id;
            this.phonenumber = BigInteger.valueOf(phonenumber);
            this.department = department;
            this.address = address;
            this.email = email;
            this.AccountNumber= AccountNumber;

        }

    public Employee() {

    }

    public String getName() {
            return name;
        }

    public Long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Long AccountNumber) {
        this.AccountNumber = AccountNumber;
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

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", AccontNumber=" + AccountNumber +
                '}' ;
    }
}



