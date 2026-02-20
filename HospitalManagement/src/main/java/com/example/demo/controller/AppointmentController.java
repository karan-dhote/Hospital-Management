package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService appointSer;
	
	@PostMapping("appointment")
	String addAppointment(@RequestBody Appointment a) {
		
		appointSer.addAppointment(a);
		return "appointment sheduled";
	}
	
	@GetMapping("appointment/{id}")
	Appointment getAppointment(@PathVariable int id) {
		return appointSer.getAppointment(id);
		
	}
}
