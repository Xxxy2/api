package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
@RestController
public class PatientTest {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @GetMapping("/test")

    public int test(){
        return jdbcTemplate.queryForObject("SELECT patient_age FROM patient WHERE id=2",Integer.class);
    }
    @GetMapping("/test2")
    public String test2(){

        return jdbcTemplate.queryForObject("SELECT patient_name FROM patient WHERE id=2",String.class);
    }

    @GetMapping("/Jarek")
    public String test3(){
        return "Jarek - mistrz Reacta bedzie odbierał takie API";
    }

}
