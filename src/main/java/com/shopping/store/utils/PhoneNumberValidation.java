package com.shopping.store.utils;

public class PhoneNumberValidation {
    public static boolean validationPhoneNumber(String phone){
        return phone.matches("(\\+98|0)?9\\d{9}");
    }
}
