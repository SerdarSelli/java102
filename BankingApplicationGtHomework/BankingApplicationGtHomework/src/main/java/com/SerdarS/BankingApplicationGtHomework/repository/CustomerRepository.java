package com.SerdarS.BankingApplicationGtHomework.repository;

import com.SerdarS.BankingApplicationGtHomework.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

     List<Customer> findByIdentityNo(Long identityNo);
    @Query("SELECT c FROM Customer c WHERE c.email = :email")
    Customer findByEmail(String email);
}
