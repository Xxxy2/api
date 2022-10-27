package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientTest {
    @GetMapping("/test")
    public String test(){
        return "Ubysz - endpoint API";
    }

    @GetMapping("/Jarek")
    public String test2(){
        return "Jarek - mistrz Reacta bedzie odbierał takie API";
    }

}
