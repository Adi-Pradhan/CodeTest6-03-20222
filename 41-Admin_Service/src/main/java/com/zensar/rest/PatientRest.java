package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.zensar.bean.Disease;
import com.zensar.bean.Employee;
import com.zensar.bean.Patient;
import com.zensar.services.PatientServices;

@RestController
@RequestMapping("/patient")
public class PatientRest {
	@Autowired
	PatientServices patientServices;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@PostMapping(value="/add")
	public Patient f1(@RequestBody Patient patient) {
		return  patientServices.addPatient(patient);
	}
	
	@RequestMapping("/Patient")
	public List<Patient> getPatient() {
		
		List<Patient> PatientList=this.patientServices.getAllPatients();
		return PatientList;
	}
	
	@RequestMapping("/Patient/{Id}")
	public Patient getPatientById(@PathVariable("Id") String Id) {
	
		return this.patientServices.findPatient(Id);
	}
	@DeleteMapping("/delete/{pid}")
	public boolean deletePatient(@PathVariable(name="pid") String id) {
		return this. patientServices.deletePatient(id);
	}
	
	@RequestMapping("/Patient/employee/{Eid}")
	public Employee getEmployee(@PathVariable("Id") String Id) {
		Employee employee;
		String url = "http://localhost:5002/employee/Employeebyid/" + Id;
		employee= restTemplate.getForObject(url, Employee.class);
		System.out.print(employee.toString());
		
		return employee;
	}
	@RequestMapping("/Patient/disease/{Eid}")
	public Disease getDiseaseById(@PathVariable("Id") String Id) {
		Disease disease;
		String url = "http://localhost:5003/Disease/diseasesbyId/" + Id;
		disease= restTemplate.getForObject(url, Disease.class);
		System.out.print(disease.toString());
		
		return disease;
	}
}
