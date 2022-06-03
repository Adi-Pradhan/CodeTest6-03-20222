package com.zensar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Patient;
@Repository
public interface PatientRepo extends JpaRepository<Patient, String>{

}
