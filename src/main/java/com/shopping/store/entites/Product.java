package com.shopping.store.entites;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "t_product")
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id")
    private Long productId;

    @Column(name = "pro_name")
    private String productName;

    @Column(name = "pro_description")
    private String productDescription;

    @Column(name = "pro_main_price")
    private Double productMainPrice;

    @Column(name = "pro_discount")
    private Double productDiscountPercent;

    @Column(name = "pro_sell_price")
    private Double productSellPrice;

    @Column(name = "pro_date_menufacture")
    private Date productManufacturerDate;

    @Column(name = "pro_expiration_date")
    private Date productExpirationDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "pro_color")
    private Color color;

    @Column(name = "pro_brand_title")
    private String productBrandTitle;

    @Column(name = "pro_brand_description")
    private String productBrandDescription;


    @ElementCollection
    @CollectionTable(name = "t_product_properties", joinColumns = @JoinColumn(name = "prp_id"))
    @MapKeyColumn(name = "prp_title")
    @Column(name = "prp_description")
    private Map<String,String> productProperties = new HashMap<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProductCategory> productCategories = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProductCart> productCarts = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProductSeller> productSellers = new HashSet<>();


    public Product() {
    }

    public Product(String productName,
                   String productDescription,
                   Double productMainPrice,
                   Double productDiscountPercent,
                   Double productSellPrice,
                   Date productManufacturerDate,
                   Date productExpirationDate,
                   Color color,
                   String productBrandTitle,
                   String productBrandDescription,
                   Map<String, String> productProperties,
                   Set<ProductCategory> productCategories,
                   Set<ProductCart> productCarts,
                   Set<ProductSeller> productSellers) {

        this.productName = productName;
        this.productDescription = productDescription;
        this.productMainPrice = productMainPrice;
        this.productDiscountPercent = productDiscountPercent;
        this.productSellPrice = productSellPrice;
        this.productManufacturerDate = productManufacturerDate;
        this.productExpirationDate = productExpirationDate;
        this.color = color;
        this.productBrandTitle = productBrandTitle;
        this.productBrandDescription = productBrandDescription;
        this.productProperties = productProperties;
        this.productCategories = productCategories;
        this.productCarts = productCarts;
        this.productSellers = productSellers;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getProductMainPrice() {
        return productMainPrice;
    }

    public void setProductMainPrice(Double productMainPrice) {
        this.productMainPrice = productMainPrice;
    }

    public Double getProductDiscountPercent() {
        return productDiscountPercent;
    }

    public void setProductDiscountPercent(Double productDiscountPercent) {
        this.productDiscountPercent = productDiscountPercent;
    }

    public Double getProductSellPrice() {
        return productSellPrice;
    }

    public void setProductSellPrice(Double productSellPrice) {
        this.productSellPrice = productSellPrice;
    }

    public Date getProductManufacturerDate() {
        return productManufacturerDate;
    }

    public void setProductManufacturerDate(Date productManufacturerDate) {
        this.productManufacturerDate = productManufacturerDate;
    }

    public Date getProductExpirationDate() {
        return productExpirationDate;
    }

    public void setProductExpirationDate(Date productExpirationDate) {
        this.productExpirationDate = productExpirationDate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getProductBrandTitle() {
        return productBrandTitle;
    }

    public void setProductBrandTitle(String productBrandTitle) {
        this.productBrandTitle = productBrandTitle;
    }

    public String getProductBrandDescription() {
        return productBrandDescription;
    }

    public void setProductBrandDescription(String productBrandDescription) {
        this.productBrandDescription = productBrandDescription;
    }

    public Map<String, String> getProductProperties() {
        return productProperties;
    }

    public void setProductProperties(Map<String, String> productProperties) {
        this.productProperties = productProperties;
    }

    public Set<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(Set<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }

    public Set<ProductCart> getProductCarts() {
        return productCarts;
    }

    public void setProductCarts(Set<ProductCart> productCarts) {
        this.productCarts = productCarts;
    }

    public Set<ProductSeller> getProductSellers() {
        return productSellers;
    }

    public void setProductSellers(Set<ProductSeller> productSellers) {
        this.productSellers = productSellers;
    }


}
