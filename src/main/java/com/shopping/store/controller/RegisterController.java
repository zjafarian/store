package com.shopping.store.controller;


import com.shopping.store.dto.RegisterCustomerRequestDto;
import com.shopping.store.entites.Customer;
import com.shopping.store.exceptions.ExistPhoneNumberException;
import com.shopping.store.mapper.RegisterCustomerMapper;
import com.shopping.store.messages.ResponseMessage;
import com.shopping.store.services.impls.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

@RestController
@RequestMapping("/register")
@Validated
public class RegisterController {

    @Autowired
    CustomerServiceImpl customerService;

    @Autowired
    RegisterCustomerMapper customerMapper;


    @PostMapping
    public ResponseEntity<ResponseMessage<?>> registerCustomer(@Valid @RequestBody RegisterCustomerRequestDto customerRequestDto)
            throws ConstraintViolationException, NullPointerException, ExistPhoneNumberException {

        Customer customer = customerMapper.toCustomer(customerRequestDto);

        customerService.save(customer);
        ResponseMessage responseMessage = ResponseMessage.withResponseData(customer, "customer Created Successfully", "message");

        return new ResponseEntity<ResponseMessage<?>>(responseMessage, HttpStatus.CREATED);
    }


}
