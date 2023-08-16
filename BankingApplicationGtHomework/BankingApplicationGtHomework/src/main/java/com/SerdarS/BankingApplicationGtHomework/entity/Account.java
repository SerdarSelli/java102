package com.SerdarS.BankingApplicationGtHomework.entity;

import com.SerdarS.BankingApplicationGtHomework.enums.AccountTypeEnum;
import com.SerdarS.BankingApplicationGtHomework.enums.CurrencyTypeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ACCOUNT")
public class Account {
    @SequenceGenerator(name = "Account",sequenceName = "ACCOUNT_ID_SEQ",allocationSize = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Account")
    @Id
    private Long id;
    @ManyToOne(cascade={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    private Customer customerId;
    private Long ibanNo;
    private Double currentBalance;
    @Enumerated(EnumType.STRING)
    private CurrencyTypeEnum currency;
    @Enumerated(EnumType.STRING)
    private AccountTypeEnum accountTypeEnum;

}
