package com.shopping.store.services.impls;

import com.shopping.store.entites.MainCategory;
import com.shopping.store.entites.Order;
import com.shopping.store.repositories.OrderRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.MainCategoryService;
import com.shopping.store.services.OrderService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order,Long> implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    protected BaseRepository<Order, Long> getBaseRepository() {
        return orderRepository;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order save(Order entity) {
        return orderRepository.save(entity);
    }

    @Override
    public List<Order> saveAll(List<Order> entities) {
        return orderRepository.saveAll(entities);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order update(Order entity) {
        return orderRepository.save(entity);
    }
}
