package com.shopping.store.exceptions;


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

    @ExceptionHandler
    ResponseEntity<ErrorResponse> handleException(ValidationPhoneNumberException exception) {
        ErrorResponse er = new ErrorResponse();
        er.setMessage(exception.getMessage());
        er.setStatus(HttpStatus.NOT_FOUND.value());
        er.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<ErrorResponse>(er, HttpStatus.BAD_REQUEST);

    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List<ErrorResponse>>
    handleConstraintViolation(ConstraintViolationException ex) {

        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(buildValidationErrors(ex.getConstraintViolations()));
    }




    private List<ErrorResponse> buildValidationErrors(
            Set<ConstraintViolation<?>> violations) {
        return violations.
                stream().
                map(violation ->{
                    return new  ErrorResponse(422,violation.getPropertyPath() + "- " + violation.getMessageTemplate(), new Date().getTime());})
                .collect(toList());

    }

}
