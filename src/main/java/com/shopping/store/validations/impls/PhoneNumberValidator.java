package com.shopping.store.validations.impls;

import com.shopping.store.utils.PhoneNumberValidation;
import com.shopping.store.validations.PhoneNumberConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumberConstraint, String> {


    @Override
    public void initialize(PhoneNumberConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        boolean check = phoneNumber.matches("(\\+98|0)?9\\d{9}");
        return phoneNumber.matches("(\\+98|0)?9\\d{9}");
    }


}
