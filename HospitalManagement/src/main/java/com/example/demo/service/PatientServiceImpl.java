package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repo.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepo pr;
	

	@Override
	public void addPatient(Patient p) {
		
		pr.save(p);
	}

	@Override
	public void deletePatient(int id) {
		
		pr.deleteById(id);
	}

	@Override
	public Patient getPatient(int id) {
		
		Optional<Patient> o=pr.findById(id);
		Patient p=o.get();
		return p;
		
	}

	
	}


