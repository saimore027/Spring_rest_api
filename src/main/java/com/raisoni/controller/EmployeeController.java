package com.raisoni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raisoni.model.Employee;
import com.raisoni.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	Employee getEmployee() {
		
		return employeeService.getEmployee();
		
	}
	@GetMapping("/employee/all")
	List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@PostMapping("/employee")
	void addEmployee(@RequestBody Employee emp){
		employeeService.addEmployee(emp);
	}

}
