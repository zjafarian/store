package com.shopping.store.entites;

import javax.persistence.*;


@Entity
@Table(name = "t_procrt")
public class ProductCart {

    @EmbeddedId
    private ProductCartId productCartId ;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("cartId")
    private Cart cart;

    public ProductCart() {
    }

    public ProductCart(Product product, Cart cart) {
        this.product = product;
        this.cart = cart;
        productCartId = new ProductCartId(product.getProductId(),cart.getCartId());
    }

    public ProductCartId getProductCartId() {
        return productCartId;
    }

    public void setProductCartId(ProductCartId productCartId) {
        this.productCartId = productCartId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }


}
