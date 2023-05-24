package com.neo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.main.model.Loan;
import com.neo.main.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
	private LoanService ls;
	
	@GetMapping("/user/{userId}")
	public List<Loan> getLoanInfo(@PathVariable Long userId){
		return this.ls.getLoaninfoOfUser(userId);
	}

}
