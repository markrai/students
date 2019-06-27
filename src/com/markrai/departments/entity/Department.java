package com.markrai.departments.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "DEP_ID", sequenceName = "DEP_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEP_ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	private BigDecimal allocation;

	List<Employee> allEmployees = new ArrayList<Employee>();
	
	List<Employee> listOfmanagers = new ArrayList<Employee>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAllocation() {
		return allocation;
	}

	public void setAllocation(BigDecimal allocation) {
		this.allocation = allocation;
	}

	public List<Employee> getListOfmanagers() {
		return listOfmanagers;
	}

	public void setListOfmanagers(List<Employee> listOfmanagers) {
		this.listOfmanagers = listOfmanagers;
	}

	public List<Employee> getAllEmployees() {
		return allEmployees;
	}

	public void setAllEmployees(List<Employee> allEmployees) {
		this.allEmployees = allEmployees;
	}
	
}
