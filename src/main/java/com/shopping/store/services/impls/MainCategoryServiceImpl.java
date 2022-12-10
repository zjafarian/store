package com.shopping.store.services.impls;

import com.shopping.store.entites.Customer;
import com.shopping.store.entites.MainCategory;
import com.shopping.store.repositories.CustomerRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.CustomerService;
import com.shopping.store.services.MainCategoryService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainCategoryServiceImpl extends BaseServiceImpl<MainCategory,Integer> implements MainCategoryService {


    @Override
    protected BaseRepository<MainCategory, Integer> getBaseRepository() {
        return null;
    }
}
