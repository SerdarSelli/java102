package com.SerdarS.BankingApplicationGtHomework.controller;

import com.SerdarS.BankingApplicationGtHomework.entity.Account;
import com.SerdarS.BankingApplicationGtHomework.entity.Customer;
import com.SerdarS.BankingApplicationGtHomework.services.entityservices.AccountEntityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    AccountEntityServices accountEntityServices;

    public AccountController(AccountEntityServices accountEntityServices) {
        this.accountEntityServices = accountEntityServices;
    }
    @PostMapping
    public Account save(@RequestBody Account account){
        account = accountEntityServices.saveAccount(account);
        return account;
    }


    @GetMapping("/customersallaccount/")
    public List<Account> getAllAccountByCustomerId(@PathVariable Customer id){
        List<Account> account=accountEntityServices.findAllAccountsByCustomerId(id);
        return account;
    }

    @DeleteMapping("/accIdDelete/{id}")
    public void deleteAccountById(@PathVariable Long id){
           accountEntityServices.deleteByAccountId(id);
    }
    @GetMapping("/findByIbanNooo/{iban}")
    public Account getByİbanNo(@PathVariable Long iban){
        Account byIbanNoo = accountEntityServices.findByIbanNoo(iban);
        return byIbanNoo;
    }

    @PostMapping("/withdraw")
    public Account withdrawMoney(@RequestParam Long iban,@RequestParam Double amounth){
        Account updateAccount = accountEntityServices.findByIbanNoo(iban);
        if (updateAccount != null&updateAccount.getCurrentBalance()-amounth>=0){
            updateAccount.setCurrentBalance(updateAccount.getCurrentBalance()-amounth);
                accountEntityServices.saveAccount(updateAccount);
        }else {
            throw new RuntimeException("iban no not found! "+ iban);
        }
        return updateAccount;
    }

    @PostMapping("/deposit")
    public Account DepositMoney(@RequestParam Long iban,@RequestParam Double amounth){
        Account updateAccount = accountEntityServices.findByIbanNoo(iban);
        if (updateAccount != null){
            updateAccount.setCurrentBalance(updateAccount.getCurrentBalance()+amounth);
            accountEntityServices.saveAccount(updateAccount);
        }else {
            throw new RuntimeException("iban no not found! "+ iban);
        }
        return updateAccount;
    }

        @GetMapping("/{id}")
    public Account getAccountById(Long id){
        Account account = accountEntityServices.findAccountByidd(id);
        return account;
    }
}
