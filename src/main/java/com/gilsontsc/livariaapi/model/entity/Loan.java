package com.gilsontsc.livariaapi.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100)
	private String customer;
	
	@Column(name = "customer_email")
	private String customerEmail;
	
	/**
	 * Um livro pode ter muitos implestimos.
	 */
	@JoinColumn(name = "id_book")
	@ManyToOne
	private Book book;
	
	@Column
	private LocalDate loanDate;
	
	@Column
	private Boolean returned;

}