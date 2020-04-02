package com.example.beanvalidationdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;
import java.util.stream.Collectors;


@RestControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(value = { MethodArgumentNotValidException.class })
    public ResponseEntity<?> beanValidationBadrequest(MethodArgumentNotValidException ex)
    {
//        System.out.println("---------------");
//        System.out.println(ex.getMessage());
//        System.out.println("---------------");
//        System.out.println(ex.getBindingResult());
//        System.out.println("---------------");
//        System.out.println(ex.getParameter());
//        System.out.println("---------------");
//        System.out.println(ex.getCause());
//        System.out.println("---------------");
//        ex.printStackTrace();
//        System.out.println("---------------");


        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> new ErrorResponse(fieldError.getField(), fieldError.getDefaultMessage()))
                .collect(Collectors.toList()));
    }
}