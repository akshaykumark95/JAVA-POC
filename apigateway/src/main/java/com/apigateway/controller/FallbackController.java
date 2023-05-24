package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "User service is down at this time";
	}
	
	@GetMapping("/loanServiceFallback")
	public String loanServiceFallback() {
		return "Loan service is down at this time";
	}
}