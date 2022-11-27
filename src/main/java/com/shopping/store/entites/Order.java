package com.shopping.store.entites;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "t_order")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ord_id")
    private Long orderId;

    @Enumerated(EnumType.STRING)
    @Column(name = "ord_status")
    private OrderStatus orderStatus;

    @Column(name = "ord_date")
    private Date orderDate;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ord_crt_id")
    private Cart cart;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ord_adr_id" )
    private Address address;



    public Order() {
    }


    public Order(OrderStatus orderStatus, Date orderDate, Cart cart, Address address) {
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.cart = cart;
        this.address = address;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
