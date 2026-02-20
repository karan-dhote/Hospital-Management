package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DocotorController {

	@Autowired
	DoctorService ds;
	
	@PostMapping("doctor")
	String addDoctor(@RequestBody Doctor d) {
		
		ds.saveDoctor(d);
		return "Doctor saved";
	}
	
	@DeleteMapping("Doctor/{id}")
	String deleteDoctor(@PathVariable int id) {
		ds.deleteDoctor(id);
		return "Docotr Deleted";
	}
	
	@GetMapping("Doctor/{id}")
	Doctor getDocotr(@PathVariable int id) {
		Doctor d=ds.getDoctor(id);
		return d;
	}
}
