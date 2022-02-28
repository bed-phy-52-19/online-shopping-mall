package com.example.demo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path="cust")
   public List<Customer> getCustomer(){
        return customerService.getCustomer();

    }
    @PostMapping(path="cust")
    public void registerNewCustomer(@RequestBody Customer customer){

        customerService.addNewCustomer(customer);
    }
    @DeleteMapping(path="{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long customerId){
      customerService.deleteCustomer(customerId);
    }
    @PutMapping( path ="{customerId}")
    public void updateCustomer(@PathVariable("customerId") Long customerId,
                              @RequestParam( required = false) String name,
                              @RequestParam(required = false) String email){
        customerService.updateCustomer(customerId, name, email);
    }
}
