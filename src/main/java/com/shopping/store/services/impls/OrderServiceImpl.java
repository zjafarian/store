package com.shopping.store.services.impls;

import com.shopping.store.entites.MainCategory;
import com.shopping.store.entites.Order;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.MainCategoryService;
import com.shopping.store.services.OrderService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order,Long> implements OrderService {


    @Override
    protected BaseRepository<Order, Long> getBaseRepository() {
        return null;
    }
}
