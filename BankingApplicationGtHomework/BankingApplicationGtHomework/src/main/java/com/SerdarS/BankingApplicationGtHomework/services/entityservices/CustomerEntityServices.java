package com.SerdarS.BankingApplicationGtHomework.services.entityservices;

import com.SerdarS.BankingApplicationGtHomework.entity.Customer;
import com.SerdarS.BankingApplicationGtHomework.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerEntityServices {
    CustomerRepository customerRepository;

    public CustomerEntityServices(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findById(Long id){
        Optional<Customer> customerOptional = customerRepository.findById(id);
        return customerOptional.get();
    }
    public List<Customer> findByIdentityNo(Long id){
        List<Customer> customerOptional = customerRepository.findByIdentityNo(id);
        return customerOptional;
    }
    public Customer findByEmaill(String email){
        Customer byEmail = customerRepository.findByEmail(email);
        return byEmail;
    }

    public Customer save(Customer customer){
        customer = customerRepository.save(customer);
        return customer;
    }
    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }
}
