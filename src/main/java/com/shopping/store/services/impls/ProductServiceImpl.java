package com.shopping.store.services.impls;

import com.shopping.store.entites.Order;
import com.shopping.store.entites.Product;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.OrderService;
import com.shopping.store.services.ProductService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product,Long> implements ProductService {


    @Override
    protected BaseRepository<Product, Long> getBaseRepository() {
        return null;
    }
}
