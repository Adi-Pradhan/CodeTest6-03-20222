package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String Id;
	private String firstname;
	private String lastname;
	private String specialty;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstname=" + firstname + ", lastname=" + lastname + ", specialty=" + specialty
				+ "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String firstname, String lastname, String specialty) {
		super();
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.specialty = specialty;
	}
	
}
