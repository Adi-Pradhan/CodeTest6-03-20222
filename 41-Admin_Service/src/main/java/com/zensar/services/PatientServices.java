package com.zensar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.netflix.discovery.converters.Auto;

import com.zensar.bean.Patient;
import com.zensar.repo.PatientRepo;
@Service
public class PatientServices {
	@Auto
	PatientRepo patientRepo;
	
	public Patient addPatient(Patient patient) {
		return patientRepo.save(patient);
	}

	public Patient findPatient(String id) {
		Optional<Patient> opt = patientRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	public List<Patient> getAllPatients() {
		return patientRepo.findAll();
	}

	public Patient  upadatePatient(Patient patient) {
		return this.patientRepo.save(patient);
	}

	public boolean deletePatient(String id) {
		this.patientRepo.deleteById(id);
		return true;
	}
}
