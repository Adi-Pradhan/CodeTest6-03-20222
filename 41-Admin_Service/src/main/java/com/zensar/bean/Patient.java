package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	private String Id;
	private String name;
	private String nationality;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", name=" + name + ", nationality=" + nationality + "]";
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String id, String name, String nationality) {
		super();
		Id = id;
		this.name = name;
		this.nationality = nationality;
	}
	
}
