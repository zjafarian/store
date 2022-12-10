package com.shopping.store.services.impls;

import com.shopping.store.entites.Cart;
import com.shopping.store.entites.Customer;
import com.shopping.store.repositories.CartRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.CartService;
import com.shopping.store.services.CustomerService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl extends BaseServiceImpl<Cart,Long> implements CartService {
    private CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    protected BaseRepository<Cart, Long> getBaseRepository() {
        return cartRepository;
    }

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart save(Cart entity) {
        return cartRepository.save(entity);
    }

    @Override
    public List<Cart> saveAll(List<Cart> entities) {
        return cartRepository.saveAll(entities);
    }

    @Override
    public Optional<Cart> findById(Long id) {
        return cartRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
       cartRepository.deleteById(id);
    }

    @Override
    public Cart update(Cart entity) {
        return cartRepository.save(entity);
    }
}
