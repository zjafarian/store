package com.shopping.store.services.impls;

import com.shopping.store.entites.Order;
import com.shopping.store.entites.Product;
import com.shopping.store.repositories.ProductRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.OrderService;
import com.shopping.store.services.ProductService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product,Long> implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    protected BaseRepository<Product, Long> getBaseRepository() {
        return productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product entity) {
        return productRepository.save(entity);
    }

    @Override
    public List<Product> saveAll(List<Product> entities) {
        return productRepository.saveAll(entities);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product update(Product entity) {
        return productRepository.save(entity);
    }
}
