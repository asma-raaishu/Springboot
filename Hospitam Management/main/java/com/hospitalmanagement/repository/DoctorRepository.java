package com.hospitalmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.model.DoctorRecords;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorRecords,Integer> 
{

	

	

}
