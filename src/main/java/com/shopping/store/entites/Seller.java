package com.shopping.store.entites;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "t_seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sell_id")
    private Long sellerId;



    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "firstname", column = @Column(name = "sell_firstname")),
            @AttributeOverride(name = "lastname", column =@Column(name = "sell_lastname")),
            @AttributeOverride(name = "national_code",column = @Column(name = "sell_national_code"))
    })

    private Person seller;


    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "email", column = @Column(name = "sell_email")),
            @AttributeOverride(name = "phoneNumber", column =@Column(name = "sell_phone_number")),
            @AttributeOverride(name = "password",column = @Column(name = "sell_password"))
    })
    private Account account;


    @OneToMany(mappedBy = "seller")
    private Set<ProductSeller> productSellers = new HashSet<>();






    public Seller() {
    }

    public Seller(Person seller, Account account, Set<ProductSeller> productSellers) {
        this.seller = seller;
        this.account = account;
        this.productSellers = productSellers;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }



    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<ProductSeller> getProductSellers() {
        return productSellers;
    }

    public void setProductSellers(Set<ProductSeller> productSellers) {
        this.productSellers = productSellers;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }
}
