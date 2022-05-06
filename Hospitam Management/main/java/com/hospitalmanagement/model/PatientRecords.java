package com.hospitalmanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="patient")
public class PatientRecords
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int p_Id;
	private String p_Name;
	private String ageAndGender;
	private String p_problems;
	private String treatment_Status;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="d_Id")
	@JsonBackReference
	private DoctorRecords doctor;
	
	public PatientRecords(String p_Name, String ageAndGender, String p_problems, String treatment_Status,
			DoctorRecords doctor) {
		super();
		this.p_Name = p_Name;
		this.ageAndGender = ageAndGender;
		this.p_problems = p_problems;
		this.treatment_Status = treatment_Status;
		//this.doctor = doctor;
		
	}	

}
