package com.shopping.store.dto;

import lombok.Builder;

@Builder
public class RegisterCustomerDto {

    private String phoneNumber;

    public RegisterCustomerDto() {
    }

    public RegisterCustomerDto(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
