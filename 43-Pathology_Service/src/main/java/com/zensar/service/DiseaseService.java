package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.Disease;
import com.zensar.repo.DiseasesRepo;
@Service
public class DiseaseService {
	@Autowired
	DiseasesRepo diseasesRepo;
	
	public Disease addDiseases(Disease disease) {
		return diseasesRepo.save(disease);
	}
	
	public Disease findDiseases(String id) {
		Optional<Disease> opt = diseasesRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	public List<Disease> getAllDiseases(){
		return diseasesRepo.findAll();
	}
	public Disease upadateDiseases(Disease disease) {
		return this.diseasesRepo.save(disease);
	}
	public boolean deleteDiseases(String id) {
		this.diseasesRepo.deleteById(id);
		return true;
	}
}
