package com.shopping.store.dto;

import com.shopping.store.validations.PhoneNumberConstraint;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Validated
public class RegisterCustomerRequestDto {

    @NotBlank
    @Size(min = 11, max = 11, message = "phone number isn't correct")
    //@PhoneNumberConstraint(message = "Invalid Phone Number")
    private String phoneNumber;


    public RegisterCustomerRequestDto() {
    }

    public RegisterCustomerRequestDto(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
