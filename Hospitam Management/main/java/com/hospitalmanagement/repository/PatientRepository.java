package com.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.model.PatientRecords;

@Repository
public interface PatientRepository extends JpaRepository<PatientRecords,Integer>
{
	@Query
	public Iterable<PatientRecords> findDoctorByName()
	{
		
	}
//@querryMethods
//	public Iterable<CustomerEntity> findCustomerByName(String name);
//
//	@Query("SELECT c FROM CustomerEntity c WHERE c.email LIKE %?1%")
//	List<CustomerEntity> findByEmailLike(String email);
}
