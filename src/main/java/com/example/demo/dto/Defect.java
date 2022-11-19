package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Defect")
public class Defect {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Defect_Id")
	private int id;
	private String name;
	
	private String message;
	
}
