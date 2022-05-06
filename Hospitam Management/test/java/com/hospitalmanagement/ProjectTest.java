package com.hospitalmanagement;
import static org.assertj.core.api.Assertions.assertThat;

//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.hospitalmanagement.model.DoctorRecords;
import com.hospitalmanagement.model.PatientRecords;
import com.hospitalmanagement.repository.DoctorRepository;
import com.hospitalmanagement.repository.PatientRepository;
@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProjectTest
{
	@Autowired
	private TestEntityManager tem;
	@Autowired
	private DoctorRepository dr;
	@Autowired
	private PatientRepository pr;
	@Test
	@Order(1)
	@Rollback(value=false)
	public void saveDoctor()
	{
		DoctorRecords d=DoctorRecords.builder().
			d_Name("Arnav").d_Stream("Neurologist").phno("9897654322").build();
		dr.save(d);
		assertThat(d.getD_Id()).isGreaterThan(0);	
	}
	@Test
	@Order(2)
	@Rollback(value=false)
	public void getDoctor()
	{
		DoctorRecords d=dr.findById(1).get();
		tem.persist(d);
		assertThat(d.getD_Id()).isEqualTo(1);	
	}
	@Test
	@Order(3)
	@Rollback(value=false)
	public void UpdateDoctor()
	{
		DoctorRecords d=dr.findById(1).get();
		tem.persist(d);
		d.setPhno("9997654322");
		DoctorRecords doctorUpdate=dr.save(d);
		assertThat(doctorUpdate.getPhno()).isEqualTo("9997654322");	
	}
	@Test
	@Order(4)
	@Rollback(value=false)
	public void deleteDoctor()
	{
		DoctorRecords d=dr.findById(1).get();
		tem.persist(d);
		dr.deleteById(1);
		DoctorRecords d1=null;
		assertThat(d1).isNull();
		
	}
	@Test
	@Order(5)
	@Rollback(value=false)
	public void savePatient()
	{
		PatientRecords p=PatientRecords.builder().p_Id(2)
				.p_Name("chandru").ageAndGender("35/male").p_problems("Alzheimer's disease")
				.treatment_Status("1 session over").build();
		pr.save(p);
		assertThat(p.getP_Id()).isGreaterThan(0);
	}
	@Test
	@Order(6)
	@Rollback(value=false)
	public void getPatient()
	{
		PatientRecords p=pr.findById(2).get();
		tem.persist(p);
		assertThat(p.getP_Id()).isEqualTo(2);	
	}
	@Test
	@Order(7)
	@Rollback(value=false)
	public void deletePatient()
	{
		PatientRecords p=pr.findById(2).get();
		tem.persist(p);
		dr.deleteAll();
		PatientRecords p1=null;
		assertThat(p1).isNull();
		
	}
	
	

}
