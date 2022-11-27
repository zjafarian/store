package com.shopping.store.entites;

import org.jboss.jandex.Main;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_sub_category")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "cat_sub_id")
    private Integer subCategoryId;

    @Column(name = "cat_sub_title")
    private String subCategoryTitle;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cat_sub_main_id")
    private MainCategory mainCategory;


    @OneToMany(mappedBy = "subCategory")
    private Set<ProductCategory> productCategories = new HashSet<>();



    public SubCategory(String subCategoryTitle, MainCategory mainCategory) {
        this.subCategoryTitle = subCategoryTitle;
        this.mainCategory = mainCategory;
    }

    public SubCategory() {

    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryTitle() {
        return subCategoryTitle;
    }

    public void setSubCategoryTitle(String subCategoryTitle) {
        this.subCategoryTitle = subCategoryTitle;
    }

    public MainCategory getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(MainCategory mainCategory) {
        this.mainCategory = mainCategory;
    }
}
