package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {

	@Id
	private int id;
	private String patientName;
	private String doctorName;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpatientName() {
		return patientName;
	}
	public void setpatientName(String pName) {
		this.patientName = pName;
	}
	public String getdoctorName() {
		return doctorName;
	}
	public void setdoctorName(String dName) {
		this.doctorName = dName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
}
