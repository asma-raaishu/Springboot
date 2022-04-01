package com.java.springbootcrudapp.bean;

import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RestController
@Entity
@Table(name="contact")
public class Contacts {
	@Id
	private int c_id;
	private String c_name;
	private long ph_no;
	

}
