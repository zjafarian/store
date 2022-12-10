package com.shopping.store.controller;


import com.shopping.store.entites.Customer;
import com.shopping.store.services.impls.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    @PostMapping
    public Customer add(@RequestBody Customer customer){
        try {
            return customerService.save(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
