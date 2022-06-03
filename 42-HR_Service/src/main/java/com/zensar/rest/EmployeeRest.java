package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.Employee;
import com.zensar.service.EmployeeServices;
@RestController
@RequestMapping("/employee")
public class EmployeeRest {

	@Autowired
	EmployeeServices employeeServices;
	
	@PostMapping(value="/add")
	public Employee f1(@RequestBody Employee employee) {
		return  employeeServices.addEmployee(employee);
	}
	
	@RequestMapping("/getEmployee")
	public List<Employee> getEmployee() {
		
		List<Employee> EmployeeList=this.employeeServices.getAllEmployees();
		return EmployeeList;
	}
	
	@RequestMapping("/Employeebyid/{Id}")
	public Employee getEmployeeById(@PathVariable("Id") String Id) {
	
		return this.employeeServices.findEmployee(Id);
	}
	@DeleteMapping("/delete/{pid}")
	public boolean deleteEmployee(@PathVariable(name="pid") String id) {
		return this. employeeServices.deleteEmployee(id);
	}
}
