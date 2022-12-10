package com.shopping.store.services.impls;

import com.shopping.store.entites.Product;
import com.shopping.store.entites.Seller;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.ProductService;
import com.shopping.store.services.SellerService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl extends BaseServiceImpl<Seller,Long> implements SellerService {


    @Override
    protected BaseRepository<Seller, Long> getBaseRepository() {
        return null;
    }
}
