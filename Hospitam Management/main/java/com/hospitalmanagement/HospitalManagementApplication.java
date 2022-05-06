package com.hospitalmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hospitalmanagement.repository.DoctorRepository;
import com.hospitalmanagement.repository.PatientRepository;

@SpringBootApplication
public class HospitalManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementApplication.class, args);
		
	}

	@Bean
	public CommandLineRunner testingDemo(DoctorRepository doctorRepository, PatientRepository patientRepository) {
		return args -> {
//
//			CustomerEntity c = new CustomerEntity();
//			c.setName("amit");
//			c.setEmail("gmail");
//			c.setGender("male");
//			customerRepository.save(c);
//
//			productRepository.save(new ProductEntity(2, "p1", 11, 1000, c));
//			productRepository.save(new ProductEntity(3, "p2", 12, 2000, c));
//			productRepository.save(new ProductEntity(4, "p3", 13, 3000, c));
//			productRepository.save(new ProductEntity(5, "p4", 14, 4000, c));
//
//			CustomerEntity c2 = new CustomerEntity();
//			c2.setName("subham");
//			c2.setEmail("shu@gmail.com");
//			c2.setGender("male");
//			customerRepository.save(c2);
//
//			productRepository.save(new ProductEntity(7, "q1", 111, 2000, c2));
//			productRepository.save(new ProductEntity(8, "q2", 125, 5000, c2));
//			productRepository.save(new ProductEntity(9, "q3", 136, 7000, c2));
//			productRepository.save(new ProductEntity(10, "q4", 149, 5000, c2));
//
//			CustomerEntity c3 = new CustomerEntity();
//			c2.setName("sanket");
//			c2.setEmail("shu@yahoo.com");
//			c2.setGender("male");
//			customerRepository.save(c3);
//
//			productRepository.save(new ProductEntity(73, "qqq1", 411, 2300, c3));
//			productRepository.save(new ProductEntity(28, "qw2", 1285, 5500, c3));
//			productRepository.save(new ProductEntity(79, "qt3", 1636, 7600, c3));
//			productRepository.save(new ProductEntity(410, "qy4", 4149, 5700, c3));
//
//			System.out.println("---- saved ------");
//			CustomerEntity ce = customerRepository.findById(1).get();
//			List<ProductEntity> pp = ce.getProducts();
//			for (ProductEntity p : pp)
//				System.out.println(p.getProductName() + " " + p.getPrice());
//
//			System.out.println("-----Query annotation test-----");
//			List<CustomerEntity> lc = customerRepository.findByEmailLike("gmail");
//			for (CustomerEntity t : lc)
//				System.out.println(t.getEmail() + " " + t.getName());
//			Iterable<CustomerEntity> lc1 = customerRepository.findCustomerByName("sanket");
//			for (CustomerEntity t : lc1)
//				System.out.println(t.getEmail() + " " + t.getName());
		};
		
		
		

}
}
