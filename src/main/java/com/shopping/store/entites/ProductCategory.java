package com.shopping.store.entites;


import jdk.jfr.Category;

import javax.persistence.*;

@Entity
@Table(name = "t_procat")
public class ProductCategory {

    @EmbeddedId
    private ProductCategoryId productCategoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("subCategoryId")
    private SubCategory subCategory;



    public ProductCategory() {
    }

    public ProductCategory(Product product, SubCategory subCategory) {
        this.product = product;
        this.subCategory = subCategory;
        productCategoryId = new ProductCategoryId(product.getProductId(),subCategory.getSubCategoryId());
    }



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }


}
