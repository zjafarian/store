package com.shopping.store.mapper;

import com.shopping.store.dto.RegisterCustomerDto;
import com.shopping.store.dto.RegisterCustomerRequestDto;
import com.shopping.store.entites.Account;
import com.shopping.store.entites.Customer;
import org.springframework.stereotype.Component;

@Component
public class RegisterCustomerMapper {

    public Customer toCustomer(RegisterCustomerRequestDto registerCustomerRequestDto) {





        Customer customer = new Customer();
        customer.setAccount(Account.builder().phoneNumber(registerCustomerRequestDto.getPhoneNumber()).build());


        return customer;
    }

    public RegisterCustomerDto toRegisterCustomerDto(Customer customer) {

        return RegisterCustomerDto.builder().phoneNumber(customer.getAccount().getPhoneNumber()).build();
    }
}
