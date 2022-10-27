package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
@RestController
public class PatientTest {
int wiek;
    @Autowired
    JdbcTemplate jdbcTemplate;


    @GetMapping("/test")

    public int test(){
        wiek = jdbcTemplate.queryForObject("SELECT patient_age FROM patient WHERE id=1",Integer.class);
        return wiek;
    }

    @GetMapping("/Jarek")
    public String test2(){
        return "Jarek - mistrz Reacta bedzie odbierał takie API";
    }

}
