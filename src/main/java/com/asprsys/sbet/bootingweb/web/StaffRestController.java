package com.asprsys.sbet.bootingweb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asprsys.sbet.bootingweb.db.model.Employee;
import com.asprsys.sbet.bootingweb.service.StaffManager;

@RestController
@RequestMapping("/api/staff/")
public class StaffRestController {

	@Autowired
	private StaffManager staffManager;
	
	@GetMapping("/allEmployees")
	public List<Employee> getAllEmployees(Model model) {
		return staffManager.getAllEmployees();
	}		
}
