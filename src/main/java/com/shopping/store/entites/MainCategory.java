package com.shopping.store.entites;


import javax.persistence.*;

@Entity
@Table(name = "t_main_category")
public class MainCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_main_id")
    private Integer mainCategoryId;


    @Column(name = "cat_main_title")
    private String mainCategoryTitle;

    public MainCategory() {
    }

    public MainCategory(String mainCategoryTitle) {
        this.mainCategoryTitle = mainCategoryTitle;
    }

    public Integer getMainCategoryId() {
        return mainCategoryId;
    }

    public void setMainCategoryId(Integer mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }

    public String getMainCategoryTitle() {
        return mainCategoryTitle;
    }

    public void setMainCategoryTitle(String mainCategoryTitle) {
        this.mainCategoryTitle = mainCategoryTitle;
    }
}
