package com.raisoni.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raisoni.dao.EmployeeDao;
import com.raisoni.model.Employee;
import com.raisoni.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		Employee emp=employeeDao.getEmployee();
		return emp;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> emp1=employeeDao.getAllEmployee();
		return emp1;
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.addEmployee(emp);
	}
	
	
	
	
	
	
	
	

}
