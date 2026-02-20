package com.example.demo.service;

import com.example.demo.entity.Appointment;

public interface AppointmentService {

	void addAppointment(Appointment a);
	Appointment getAppointment(int id);
}
