package com.SerdarS.BankingApplicationGtHomework.repository;

import com.SerdarS.BankingApplicationGtHomework.entity.Account;
import com.SerdarS.BankingApplicationGtHomework.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {

   List<Account> findAllByCustomerId(Customer customerId);

@Query("SELECT c FROM Account c WHERE c.ibanNo = :ibanNo")
    Account findByIbanNo(Long ibanNo);

}
