package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.Employee;
import com.zensar.dao.EmployeeRepo;
@Service
public class EmployeeServices {
	@Autowired
	EmployeeRepo employeeRepo;

	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public Employee findEmployee(String id) {
		Optional<Employee> opt = employeeRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	public Employee  upadateEmployee(Employee employee) {
		return this.employeeRepo.save(employee);
	}

	public boolean deleteEmployee(String id) {
		this.employeeRepo.deleteById(id);
		return true;
	}
}
