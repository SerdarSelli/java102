package com.SerdarS.BankingApplicationGtHomework.services.entityservices;

import com.SerdarS.BankingApplicationGtHomework.entity.Account;
import com.SerdarS.BankingApplicationGtHomework.entity.Customer;
import com.SerdarS.BankingApplicationGtHomework.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountEntityServices {
    AccountRepository accountRepository;

    public AccountEntityServices(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> findAllAccountsByCustomerId(Customer id){
        List<Account> allByCustomerId = accountRepository.findAllByCustomerId(id);
        return allByCustomerId;
    }


    public Account saveAccount(Account account){
        account = accountRepository.save(account);
        return account;
    }

    public void deleteByAccountId(Long id){
        accountRepository.deleteById(id);
    }




public Account findByIbanNoo(Long ibanNo){
    Account byIbanNo = accountRepository.findByIbanNo(ibanNo);
    return byIbanNo;
}

public Account findAccountByidd(Long id){
    Optional<Account> findById = accountRepository.findById(id);
    return findById.get();
}



}
