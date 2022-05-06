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

import com.hospitalmanagement.model.DoctorRecords;
import com.hospitalmanagement.service.DoctorService;

@RestController
public class DoctorController
{
	@Autowired
	private DoctorService ds;
	@GetMapping(value="/getdoctor")
	public List<DoctorRecords> getAllDoctorRecords()
	{
		return ds.getAllDoctorRecords();
	}

	@PostMapping(value="/savedoctor")
	public DoctorRecords saveDoctorRecords(@RequestBody DoctorRecords d)
	{
		
		return ds.saveDoctorRecords(d);
		
	}
	@GetMapping(value="/fetchdoctor/{d_Id}")
	public DoctorRecords getAnDoctorRecords(@PathVariable int d_Id)
	{
		return ds.getAnDoctorRecords(d_Id);
	}
	@PutMapping(value="/updatedoctor/{d_Id}")
	public DoctorRecords updateDoctorRecords(@PathVariable int d_Id,@RequestBody DoctorRecords d)
	{
		
		return ds.updateDoctorRecords(d_Id, d); 
		
	}
	@DeleteMapping(value="/deletedoctor/{d_Id}")
	public String deletDoctorRecords(@PathVariable int d_Id)
	{
		
		return ds.deleteDoctorRecords(d_Id);
		
	}
	
	

}
