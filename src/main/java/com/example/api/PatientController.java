package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping(path = "/patients")
    public ResponseEntity<List<Patient>> getAllPatients(){
        List<Patient> patients = jdbcTemplate.query("SELECT * FROM patient",new BeanPropertyRowMapper(Patient.class));
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }
}
