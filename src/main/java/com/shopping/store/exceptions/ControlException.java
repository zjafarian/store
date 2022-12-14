package com.shopping.store.exceptions;


import com.shopping.store.messages.ErrorMessages;
import com.shopping.store.messages.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

@ControllerAdvice
public class ControlException {


    @Autowired
    private ErrorMessages errorMessages;


    @ExceptionHandler
    ResponseEntity<ErrorResponse> handleValidationPhoneNumber(ValidationPhoneNumberException exception) {
        ErrorResponse er = new ErrorResponse();
        er.setMessage(exception.getMessage());
        er.setStatus(HttpStatus.NOT_FOUND.value());
        er.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<ErrorResponse>(er, HttpStatus.BAD_REQUEST);

    }



    @ExceptionHandler
    ResponseEntity<ErrorResponse> handleExistPhoneNumberException(ExistPhoneNumberException exception) {
        ErrorResponse er = new ErrorResponse();
        er.setMessage(exception.getMessage());
        er.setStatus(HttpStatus.NOT_FOUND.value());
        er.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<ErrorResponse>(er, HttpStatus.INTERNAL_SERVER_ERROR);

    }



    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List<ErrorResponse>>
    handleConstraintViolation(ConstraintViolationException ex) {
        return ResponseEntity
                .status(HttpStatus.UNPROCESSABLE_ENTITY)
                .body(buildValidationErrors(ex.getConstraintViolations()));
    }



    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErrorResponse>
    handleNullPointer(NullPointerException ex) {
        return ResponseEntity
                .status(HttpStatus.UNPROCESSABLE_ENTITY)
                .body(buildNullPointerErrors());
    }



    private List<ErrorResponse> buildValidationErrors(
            Set<ConstraintViolation<?>> violations) {
        return violations.
                stream().
                map(violation -> {
                    return new ErrorResponse(422,
                            violation.getPropertyPath() + "- " + violation.getMessageTemplate(),
                            new Date().getTime());
                })
                .collect(toList());

    }




    private ErrorResponse buildNullPointerErrors() {
         return new ErrorResponse(500, errorMessages.getMESSAGE_NULL_ENTRY(), new Date().getTime());

    }

}
