package com.example.beanvalidationdemo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@lombok.Data
public class Data {
    @NotNull(message = "value1 should not be null")
    private Integer value1;
    @NotNull(message = "value2 should not be null")
    private String value2;
    @NotEmpty(message = "{value3.empty}")
    private String value3;
}
