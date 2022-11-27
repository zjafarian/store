package com.shopping.store.entites;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sell_id")
    private Long sellerId;

    @Column(name = "sell_firstname")
    private String firstname;

    @Column(name = "sell_lastname")
    private String lastname;

    @Column(name = "sell_national_code")
    private String nationalCode;


    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "email", column = @Column(name = "sell_email")),
            @AttributeOverride(name = "phoneNumber", column =@Column(name = "sell_phone_number")),
            @AttributeOverride(name = "password",column = @Column(name = "sell_password"))
    })
    private Account account;






    public Seller() {
    }

    public Seller(String firstname,
                  String lastname,
                  String nationalCode,
                  Account account) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.nationalCode = nationalCode;
        this.account = account;
    }


    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
