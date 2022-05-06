package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.hospitalmanagement.model.PatientRecords;

import com.hospitalmanagement.service.PatientService;

@RestController
public class PatientController
{
	@Autowired
	public PatientService ps;
	@GetMapping("/getpatients")
	public List<PatientRecords> getAllPatientRecords()
	{
		return ps.getAllPatientRecords();
		
	}
	@PostMapping(value="/savepatients")
	public PatientRecords savePatient(@RequestBody PatientRecords p)
	{
		
		return ps.savePatientRecords(p);
	}
	@GetMapping("/fetchpatients/{p_Id}")
	public PatientRecords getAnPatientRecords(@PathVariable int p_Id)
	{
		return ps.getAnPatientrRecords(p_Id);
		
	}
	@PutMapping("/updatepatients/{p_Id}")
	public PatientRecords updatePatient(@PathVariable int p_Id,@RequestBody PatientRecords p)
	{
		return ps.updatePatientRecords(p_Id,p);
	}
	@DeleteMapping("/deletepatients/{p_Id}")
	public String deletePatient(@PathVariable int p_Id)
	{
		return ps.DeletePatientRecords(p_Id);
	}
	

}
