package com.java.springbootcrud.product;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")

public class Product {
	@Id
	private int p_Id;
	private String p_Name;
	private String brand;
	private String madein;
	private long price;
	private LocalDate mfgyr;

}
