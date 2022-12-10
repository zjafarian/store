package com.shopping.store.services.impls;

import com.shopping.store.entites.Customer;
import com.shopping.store.repositories.CustomerRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.CustomerService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer,Long> implements CustomerService{


    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    protected BaseRepository<Customer, Long> getBaseRepository() {
        return customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return super.findAll();
    }

    @Override
    public Customer save(Customer entity) {
        return super.save(entity);
    }

    @Override
    public List<Customer> saveAll(List<Customer> entities) {
        return super.saveAll(entities);
    }

    @Override
    public Optional<Customer> findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void delete(Long aLong) {
        super.delete(aLong);
    }

    @Override
    public Customer update(Customer entity) {
        return super.update(entity);
    }
}
