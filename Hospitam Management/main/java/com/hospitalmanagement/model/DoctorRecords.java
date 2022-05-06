package com.hospitalmanagement.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="doctor")

public class DoctorRecords 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int d_Id;
	private String d_Name;
	private String d_Stream;
	private String phno;
	@OneToMany(mappedBy="doctor",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<PatientRecords> patient;
	public DoctorRecords(String d_Name, String phno, List<PatientRecords> patient, String d_Stream) {
		super();
		this.d_Name = d_Name;
		this.d_Stream=d_Stream;
		this.phno = phno;
		this.patient = patient;
	}
	
	

}
