package com.example.api;

public class Patient {
    private int id;
    private String patient_name;
    private int patient_age;
    private String patient_lastname;


    public Patient(){

    }

    public Patient(int id, String patient_name, int patient_age, String patient_lastname) {
        this.id = id;
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_lastname = patient_lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public int getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(int patient_age) {
        this.patient_age = patient_age;
    }

    public String getPatient_lastname() {
        return patient_lastname;
    }

    public void setPatient_lastname(String patient_lastname) {
        this.patient_lastname = patient_lastname;
    }
}
