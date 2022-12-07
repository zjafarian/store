package com.shopping.store.entites;

import org.assertj.core.util.Preconditions;
import org.springframework.data.repository.Repository;

import javax.persistence.*;

@Entity
@Table(name = "t_prosell")
public class ProductSeller {

    @EmbeddedId
    private ProductSellerId productSellerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("sellerId")
    private Seller seller;


    public ProductSeller() {
    }

    public ProductSeller(Product product, Seller seller) {
        this.product = product;
        this.seller = seller;



        productSellerId = new ProductSellerId(product.getProductId(),seller.getSellerId());
    }

    public ProductSellerId getProductSellerId() {
        return productSellerId;
    }

    public void setProductSellerId(ProductSellerId productSellerId) {
        this.productSellerId = productSellerId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
