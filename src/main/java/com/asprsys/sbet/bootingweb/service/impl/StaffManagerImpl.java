package com.asprsys.sbet.bootingweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asprsys.sbet.bootingweb.db.EmployeeRepository;
import com.asprsys.sbet.bootingweb.db.model.Employee;
import com.asprsys.sbet.bootingweb.service.StaffManager;

@Service
public class StaffManagerImpl implements StaffManager {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	private static final List<Employee> staticEmployees = new ArrayList<Employee>();
	static {
		for(int i = 1; i < 11; i++) {
			staticEmployees.add(new Employee("EmpID"+i, "fn:"+i, "ln"+i, "pos:"+i));
		}
	}	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
