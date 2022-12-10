package com.shopping.store.services.impls;

import com.shopping.store.entites.Cart;
import com.shopping.store.entites.Customer;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.CartService;
import com.shopping.store.services.CustomerService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl extends BaseServiceImpl<Cart,Long> implements CartService {
    @Override
    protected BaseRepository<Cart, Long> getBaseRepository() {
        return null;
    }
}
