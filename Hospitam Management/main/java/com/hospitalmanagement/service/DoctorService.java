package com.hospitalmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.exceptionhandler.DoctorNotFoundException;
import com.hospitalmanagement.model.DoctorRecords;
import com.hospitalmanagement.repository.DoctorRepository;
@Service
public class DoctorService
{
	@Autowired
	public DoctorRepository dr;
	public List<DoctorRecords> getAllDoctorRecords() 
	{
		return dr.findAll();
	}
	public DoctorRecords saveDoctorRecords(DoctorRecords d) 
	{	
		return dr.save(d);
	}
	public DoctorRecords getAnDoctorRecords(int d_Id)
	{
		return dr.findById(d_Id)
				.orElseThrow(() -> new DoctorNotFoundException("Doctor with id "+d_Id+" Not Found ..."));	
	}
	public DoctorRecords updateDoctorRecords(int d_Id,DoctorRecords d)
	{
		DoctorRecords dro=dr.findById(d_Id).get();
		dro.setD_Name(d.getD_Name());
		dro.setD_Stream(d.getD_Stream());
		dro.setPhno(d.getPhno());
		return dr.save(dro);
	}
	public String deleteDoctorRecords(int d_Id)
	{
		dr.deleteById(d_Id);
		return "Doctor with id "+d_Id+"has been deleted!!" ;
	}	
}
