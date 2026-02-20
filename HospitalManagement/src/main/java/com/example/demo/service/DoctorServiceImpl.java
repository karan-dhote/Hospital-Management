package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	DoctorRepository ds;

	@Override
	public void saveDoctor(Doctor d) {
		// TODO Auto-generated method stub
		
		ds.save(d);
		
	}

	@Override
	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub
		ds.deleteById(id);
	}

	@Override
	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		Optional<Doctor>o= ds.findById(id);
		return o.get();
		
	}

}
