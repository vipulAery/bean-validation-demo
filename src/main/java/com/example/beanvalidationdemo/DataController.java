package com.example.beanvalidationdemo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RestController
public class DataController {
    @PostMapping( "/data-valid")
    public void saveValidData(@Valid @RequestBody Data data){
        System.out.println(data);
    }

    @PostMapping( "/data-validated")
    public void saveNestedValidData(@Validated @RequestBody Data data){
        System.out.println(data);
    }

    @PostMapping( "/nested-data-valid")
    public void saveValidatedData(@Valid @RequestBody NestedData nestedData){
        System.out.println(nestedData);
    }

    @PostMapping( "/nested-data-validated")
    public void saveNestedValidatedData(@Validated @RequestBody NestedData nestedData){
        System.out.println(nestedData);
    }
}
