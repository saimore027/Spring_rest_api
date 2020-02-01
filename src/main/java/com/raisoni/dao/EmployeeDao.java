package com.raisoni.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.raisoni.model.Employee;
@Mapper	
public interface EmployeeDao {
	@Select("select name,age from employee limit 1")
	Employee getEmployee();
	
	@Select("select name,age from employee")
	List<Employee> getAllEmployee();
	
	@Insert("insert into employee(is,name) values(#{id},#{name})")
	void addEmployee(Employee emp);
	
}
