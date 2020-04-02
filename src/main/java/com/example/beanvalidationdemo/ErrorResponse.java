package com.example.beanvalidationdemo;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ErrorResponse {
    private int errorCode;
    private String message;
}
