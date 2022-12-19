package com.shopping.store.entites;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_cart")
public class Cart extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crt_id")
    private Long cartId;

    @Column(name = "crt_data")
    private Date cartDate;

    @Column(name = "crt_profit_amount")
    private Double cartProfitAmount;

    @Column(name = "crt_price_products")
    private Double cartPriceProducts;

    @OneToOne
    @JoinColumn(name = "crt_cus_id" )
    private Customer customer;


    @OneToMany(mappedBy = "cart")
    private Set<ProductCart> productCarts = new HashSet<>();






    public Cart() {
    }

    public Cart(Date cartDate,
                Double cartProfitAmount,
                Double cartPriceProducts,
                Customer customer,
                Set<ProductCart> productCarts) {


        this.cartDate = cartDate;
        this.cartProfitAmount = cartProfitAmount;
        this.cartPriceProducts = cartPriceProducts;
        this.customer = customer;
        this.productCarts = productCarts;
    }

    public Date getCartDate() {
        return cartDate;
    }

    public void setCartDate(Date cartDate) {
        this.cartDate = cartDate;
    }

    public Double getCartProfitAmount() {
        return cartProfitAmount;
    }

    public void setCartProfitAmount(Double cartProfitAmount) {
        this.cartProfitAmount = cartProfitAmount;
    }

    public Double getCartPriceProducts() {
        return cartPriceProducts;
    }

    public void setCartPriceProducts(Double cartPriceProducts) {
        this.cartPriceProducts = cartPriceProducts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Set<ProductCart> getProductCarts() {
        return productCarts;
    }

    public void setProductCarts(Set<ProductCart> productCarts) {
        this.productCarts = productCarts;
    }


}
