package com.shopping.store.entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductSellerId implements Serializable {

    @Column(name = "prosell_sell_id")
    private Long productId;

    @Column(name = "prosell_pro_id")
    private Long sellerId;

    public ProductSellerId() {
    }

    public ProductSellerId(Long productId, Long sellerId) {
        this.productId = productId;
        this.sellerId = sellerId;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getSellerId() {
        return sellerId;
    }
}


