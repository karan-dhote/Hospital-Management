package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService ps;
	
	@PostMapping("patient")
	String addPatient( @RequestBody Patient p) {
		ps.addPatient(p);
		return "patient added";
	}
	
	@DeleteMapping("patient/{id}")
	String deletePatient(@PathVariable int id) {
		ps.deletePatient(id);
		return "patient deleted";
	}
	
	@GetMapping("patient/{id}")
	Patient getPatient(@PathVariable int id) {
		return ps.getPatient(id);
	}
	
}
