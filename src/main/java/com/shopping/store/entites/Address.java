package com.shopping.store.entites;

import javax.persistence.*;


@Entity
@Table(name = "t_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adr_id")
    private Long addressId;

    @Column(name = "adr_title")
    private String addressTitle;

    @Column(name = "adr_latitude")
    private Double latitude;

    @Column(name = "adr_longitude")
    private Double longitude;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adr_cus_id")
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adr_sell_id")
    private Seller seller;



    public Address() {
    }

    public Address(String addressTitle, Double latitude, Double longitude, Customer customer) {
        this.addressTitle = addressTitle;
        this.latitude = latitude;
        this.longitude = longitude;
        this.customer = customer;
    }

    public Address(String addressTitle, Double latitude, Double longitude, Seller seller) {
        this.addressTitle = addressTitle;
        this.latitude = latitude;
        this.longitude = longitude;
        this.seller = seller;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddressTitle() {
        return addressTitle;
    }

    public void setAddressTitle(String addressTitle) {
        this.addressTitle = addressTitle;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
