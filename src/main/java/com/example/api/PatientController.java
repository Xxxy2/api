package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PatientController {
    public int id=8;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping(path = "/patients")
    public ResponseEntity<List<Patient>> getAllPatients(){
        List<Patient> patients = jdbcTemplate.query("SELECT * FROM patient",new BeanPropertyRowMapper(Patient.class));
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }
    @PostMapping(path = "/patients",consumes = "application/json")
    public String addPatient(@RequestBody Patient newPatient)
    {
        String insert_query = "INSERT INTO patient (id, patient_name,patient_age,patient_lastname) VALUE(?,?,?,?);";
        jdbcTemplate.update(insert_query,id,newPatient.getPatient_name(),newPatient.getPatient_age(),newPatient.getPatient_lastname());
        id++;
    return "dodano nowego pacjenta "+newPatient.getPatient_name();
    }

    @GetMapping(path = "/patients/")
    @ResponseBody
    public String getPatient(@RequestParam int newId){
        //String insert_query ="SELECT patient_name FROM patient WHERE id=noweId";
         String name ="ID "+newId;
        //String name = jdbcTemplate.queryForObject(insert_query,String.class);
        return name;
    }

    @RequestMapping(value = "/patients/{noweid}", method = GET)
    @ResponseBody
    public String getFoosBySimplePathWithPathVariable(@PathVariable("noweid")int noweid) {
System.out.println(noweid);
        String insert_query ="SELECT patient_name FROM patient WHERE id=noweid;";
        jdbcTemplate.update(insert_query,noweid);



       // String name ="ID "+newId;
        String name = jdbcTemplate.queryForObject(insert_query,String.class);
        System.out.println(name);
        return name;
      //  return "Get a specific Foo with id=" + id;
    }


}
