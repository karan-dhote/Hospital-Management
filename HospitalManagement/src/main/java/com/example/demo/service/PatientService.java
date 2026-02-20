package com.example.demo.service;
import com.example.demo.entity.Patient;

public interface PatientService {
	
	void addPatient(Patient p);
	void deletePatient(int id);
	Patient getPatient(int id);

}
