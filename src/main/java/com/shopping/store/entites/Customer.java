package com.shopping.store.entites;

import lombok.Builder;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "t_customer")

public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_id")
    private Long customerId;


    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "firstname", column = @Column(name = "cus_firstname")),
            @AttributeOverride(name = "lastname", column =@Column(name = "cus_lastname")),
            @AttributeOverride(name = "national_code",column = @Column(name = "cus_national_code"))
    })
    private Person customer;

    @Column(name = "cus_birthday")
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

    public Customer(Person customer, Date customerBirthday, Account account) {
        this.customer = customer;
        this.customerBirthday = customerBirthday;
        this.account = account;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person person) {
        this.customer = person;
    }
}
