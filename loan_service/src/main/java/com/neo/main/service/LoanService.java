package com.neo.main.service;

import java.util.List;

import com.neo.main.model.Loan;

public interface LoanService {
	
	public List<Loan> getLoaninfoOfUser(Long userId);

}
