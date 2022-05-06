package com.hospitalmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.exceptionhandler.PatientNotFoundException;
import com.hospitalmanagement.model.PatientRecords;
import com.hospitalmanagement.repository.PatientRepository;
@Service
public class PatientService {
	@Autowired
	public PatientRepository pr;

	public List<PatientRecords> getAllPatientRecords() {

		return pr.findAll() ;
	}
	public PatientRecords savePatientRecords(PatientRecords p) {
		
		return pr.save(p);
	}
	public PatientRecords getAnPatientrRecords(int p_Id) 
	{
		return pr.findById(p_Id)
				.orElseThrow(() ->new PatientNotFoundException("patient with id "+p_Id+" Not Found...."));
	}
	public PatientRecords updatePatientRecords(int p_Id, PatientRecords p) 
	{
		PatientRecords pro=pr.findById(p_Id).get();
		pro.setP_Name(p.getP_Name());
		pro.setAgeAndGender(p.getAgeAndGender());
		pro.setP_problems(p.getP_problems());
		pro.setTreatment_Status(p.getTreatment_Status());
		return pr.save(pro);
	}
	public String DeletePatientRecords(int p_Id)
	{
		pr.deleteById(p_Id);
		
		return "patient with id "+p_Id+" has been deleted!!";
	}

	
	}

	

	
	

