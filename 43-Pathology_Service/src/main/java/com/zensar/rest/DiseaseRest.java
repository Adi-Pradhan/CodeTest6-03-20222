package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.Disease;

import com.zensar.service.DiseaseService;

@RestController
@RequestMapping("/Disease")
public class DiseaseRest {

	@Autowired
	DiseaseService diseaseService;
	
	@PostMapping(value="/add")
	public Disease f1(@RequestBody Disease disease) {
		return  diseaseService.addDiseases(disease);
	}
	
	@RequestMapping("/getdiseases")
	public List<Disease> getDiseases() {
		
		List<Disease> diseasesList=this.diseaseService.getAllDiseases();
		return diseasesList;
	}
	
	@RequestMapping("/diseasesbyId/{Id}")
	public Disease getDiseaseById(@PathVariable("Id") String Id) {
	
		return this.diseaseService.findDiseases(Id);
	}
	@DeleteMapping("/delete/{pid}")
	public boolean deleteDisease(@PathVariable(name="pid") String id) {
		return this. diseaseService.deleteDiseases(id);
	}
}
