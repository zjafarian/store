package com.shopping.store.entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductCartId implements Serializable {


    @Column(name = "procrt_pro_id")
    private Long productId;

    @Column(name = "procrt_crt_id")
    private Long cartId;

    public ProductCartId() {
    }

    public ProductCartId(Long productId, Long cartId) {
        this.productId = productId;
        this.cartId = cartId;
    }


    public Long getProductId() {
        return productId;
    }

    public Long getCartId() {
        return cartId;
    }
}
