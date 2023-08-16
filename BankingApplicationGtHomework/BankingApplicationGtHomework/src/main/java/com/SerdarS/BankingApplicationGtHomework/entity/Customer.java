package com.SerdarS.BankingApplicationGtHomework.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "customer_id_gen")
    @SequenceGenerator(name = "customer_id_gen",sequenceName = "seq_gen",allocationSize = 5)
    private Long id;
    @OneToMany(mappedBy = "customerId", cascade={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    //@JoinColumn(name = "customerId")
    private Set<Account> accounts;
    private String name;
    //@Column(name = "surname",length = 60)
    private String surname;
    //@Column(name = "identityNo",length = 60)
    private Long identityNo;
    private String password;
    private String email;
    private Integer phoneNumber;

}
