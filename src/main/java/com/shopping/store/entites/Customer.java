package com.shopping.store.entites;

import javax.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "t_customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_id")
    private Long customerId;

    @Column(name = "cus_firstname")
    private String firstname;

    @Column(name = "cus_lastname")
    private String lastname;

    @Column(name = "cus_national_code")
    private String nationalCode;

    @Column(name = "cus_birthday")
    @Temporal(TemporalType.DATE)
    private Date customerBirthday;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "email", column = @Column(name = "cus_email")),
            @AttributeOverride(name = "phoneNumber", column =@Column(name = "cus_phone_number")),
            @AttributeOverride(name = "password",column = @Column(name = "cus_password"))
    })
    private Account account;







    public Customer() {
    }

    public Customer(String firstname,
                    String lastname,
                    String nationalCode,
                    Date customerBirthday,
                    Account account) {


        this.firstname = firstname;
        this.lastname = lastname;
        this.nationalCode = nationalCode;
        this.customerBirthday = customerBirthday;
        this.account = account;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public Date getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(Date customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }




}
