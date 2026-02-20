package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repo.AppointRepo;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	AppointRepo appointmentRepo;

	@Override
	public void addAppointment(Appointment a) {
		// TODO Auto-generated method stub
		appointmentRepo.save(a);
		
	}

	@Override
	public Appointment getAppointment(int id) {
		// TODO Auto-generated method stub
		Optional<Appointment> o = appointmentRepo.findById(id);
		Appointment ap= o.get();
		return ap;
		
	}

}
