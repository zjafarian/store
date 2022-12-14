package com.shopping.store.services.impls;

import com.shopping.store.entites.Customer;

import com.shopping.store.exceptions.ExistPhoneNumberException;
import com.shopping.store.exceptions.ValidationPhoneNumberException;
import com.shopping.store.repositories.CustomerRepository;
import com.shopping.store.repositories.base.BaseRepository;
import com.shopping.store.services.CustomerService;
import com.shopping.store.services.base.impls.BaseServiceImpl;
import com.shopping.store.utils.PhoneNumberValidation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@PropertySource("classpath:application.properties")
public class CustomerServiceImpl extends BaseServiceImpl<Customer,Long> implements CustomerService{


    private CustomerRepository customerRepository;

    @Value("${phone.number.not.valid}")
    private String MESSAGE_PHONE_IS_NOT_CORRECT;


    @Value("${phone.number.not.unique}")
    private String MESSAGE_PHONE_IS_EXISTED;

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
        if (!PhoneNumberValidation.validationPhoneNumber(entity.getAccount().getPhoneNumber()))
            throw new ValidationPhoneNumberException(MESSAGE_PHONE_IS_NOT_CORRECT);


        if (customerRepository.findCustomerByAccount_PhoneNumber(entity.getAccount().getPhoneNumber()).isPresent())
            throw new ExistPhoneNumberException(MESSAGE_PHONE_IS_EXISTED);


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
