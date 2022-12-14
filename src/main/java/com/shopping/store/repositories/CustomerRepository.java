package com.shopping.store.repositories;

import com.shopping.store.entites.Customer;
import com.shopping.store.repositories.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CustomerRepository extends BaseRepository<Customer,Long> {


    Optional<Customer> findCustomerByAccount_PhoneNumber(String phoneNumber);


}
