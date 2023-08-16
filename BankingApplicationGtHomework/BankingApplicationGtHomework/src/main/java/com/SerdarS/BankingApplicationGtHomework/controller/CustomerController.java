package com.SerdarS.BankingApplicationGtHomework.controller;

import com.SerdarS.BankingApplicationGtHomework.entity.Customer;
import com.SerdarS.BankingApplicationGtHomework.services.entityservices.CustomerEntityServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    CustomerEntityServices customerEntityServices;

    public CustomerController(CustomerEntityServices customerEntityServices) {
        this.customerEntityServices = customerEntityServices;
    }
@GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
    Customer customer = customerEntityServices.findById(id);
    return customer;
}
    @GetMapping("/findByIdentity/{identityNo}")
    public List<Customer> getCustomerByIdentityNo(@PathVariable Long identityNo){
        List<Customer> customer = customerEntityServices.findByIdentityNo(identityNo);
        return customer;
    }

@PostMapping
    public Customer save( @RequestBody Customer customer){
        customer = customerEntityServices.save(customer);
        return customer;
}

@GetMapping("/findByEmail/")
public Customer getcustomerByEmail(@RequestParam String email){
    Customer byEmaill = customerEntityServices.findByEmaill(email);
    return byEmaill;
}

@DeleteMapping("/deleteCustomerById/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerEntityServices.deleteCustomerById(id);
}

}
