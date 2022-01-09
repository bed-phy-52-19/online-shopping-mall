package com.example.demo;

//import com.example.demo.Customer.Customer;
//import com.example.demo.Customer.CustomerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//import java.util.List;

@SpringBootApplication
//@RestController
public class DemoApplication {

	public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
	}
//    @GetMapping
//    public List<Customer> hello(){
//        return List.of(new CustomerBuilder().setName("chisomo").setPhonenumber(68).setCountry("malawi").setAddress("mbayan").setEmail("@cc.ac.mw").createCustomer());
//    }

}
