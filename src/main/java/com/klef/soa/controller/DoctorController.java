package com.klef.soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.klef.soa.entity.Doctor;
import com.klef.soa.service.DoctorService;

@RestController
public class DoctorController 
{
    @Autowired
    private DoctorService service;

    @GetMapping("/")
    public String demo() {
        return "Spring Boot Project";
    }

    @PostMapping("/add")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor d) {
        Doctor doctor = service.addDoctor(d);
        return ResponseEntity.status(201).body(doctor);
    }
    
    @GetMapping("/displayall")
    public ResponseEntity<List<Doctor>> displayAllDoctors() {
        List<Doctor> doctors = service.displayAllDoctors();
        return ResponseEntity.ok(doctors);
    }


}
