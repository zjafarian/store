package com.shopping.store.services.impls;

import com.shopping.store.entites.Seller;
import com.shopping.store.entites.SubCategory;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.SellerService;
import com.shopping.store.services.SubCategoryService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubCategoryServiceImpl extends BaseServiceImpl<SubCategory,Integer> implements SubCategoryService {


    @Override
    protected BaseRepository<SubCategory, Integer> getBaseRepository() {
        return null;
    }





}
