package com.example.beanvalidationdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ErrorResponse {
    private String errorField;
    private String message;
}

//https://www.baeldung.com/jackson-jsonmappingexception