package com.example.demo.service;

import com.example.demo.entity.Doctor;

public interface DoctorService {
	
	void saveDoctor(Doctor d);
	void deleteDoctor(int id);
	Doctor getDoctor(int id);

}
