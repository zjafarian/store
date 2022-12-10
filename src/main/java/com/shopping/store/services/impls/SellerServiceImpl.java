package com.shopping.store.services.impls;

import com.shopping.store.entites.Product;
import com.shopping.store.entites.Seller;
import com.shopping.store.repositories.SellerRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.ProductService;
import com.shopping.store.services.SellerService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerServiceImpl extends BaseServiceImpl<Seller,Long> implements SellerService {

    private SellerRepository sellerRepository;


    public SellerServiceImpl(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Override
    protected BaseRepository<Seller, Long> getBaseRepository() {
        return sellerRepository;
    }

    @Override
    public List<Seller> findAll() {
        return sellerRepository.findAll();
    }

    @Override
    public Seller save(Seller entity) {
        return sellerRepository.save(entity);
    }

    @Override
    public List<Seller> saveAll(List<Seller> entities) {
        return sellerRepository.saveAll(entities);
    }

    @Override
    public Optional<Seller> findById(Long id) {
        return sellerRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        sellerRepository.deleteById(id);
    }

    @Override
    public Seller update(Seller entity) {
        return sellerRepository.save(entity);
    }
}
