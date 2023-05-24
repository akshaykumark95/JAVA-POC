package com.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.model.Employee;
import com.dashboard.repository.EmpRepository;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpRepository er;
	
	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee emp) {
		return er.save(emp);
		
	}

}
