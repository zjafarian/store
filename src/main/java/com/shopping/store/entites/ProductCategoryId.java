package com.shopping.store.entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductCategoryId implements Serializable {

    @Column(name = "procat_pro_id")
    private Long productId;

    @Column(name = "procat_cat_id")
    private Integer categoryId;

    public ProductCategoryId() {
    }

    public ProductCategoryId(Long productId, Integer categoryId) {
        this.productId = productId;
        this.categoryId = categoryId;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }
}
