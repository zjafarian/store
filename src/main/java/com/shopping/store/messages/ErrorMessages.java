package com.shopping.store.messages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ErrorMessages {
    @Value("${phone.number.not.valid}")
    private String MESSAGE_PHONE_IS_NOT_CORRECT;


    @Value("${phone.number.not.unique}")
    private String MESSAGE_PHONE_IS_EXISTED;

    @Value("${entry.null}")
    private String MESSAGE_NULL_ENTRY;

    public ErrorMessages() {
    }

    public String getMESSAGE_PHONE_IS_NOT_CORRECT() {
        return MESSAGE_PHONE_IS_NOT_CORRECT;
    }

    public String getMESSAGE_PHONE_IS_EXISTED() {
        return MESSAGE_PHONE_IS_EXISTED;
    }

    public String getMESSAGE_NULL_ENTRY() {
        return MESSAGE_NULL_ENTRY;
    }
}
