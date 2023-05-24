package com.neo.main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.neo.main.model.Loan;

@Service
public class LoanServiceImpl implements LoanService{
	
	//fake list of loans
	List<Loan> list=List.of(
			
			new Loan(1001L,"Personal Loan","Personal",1213L),
			new Loan(1002L,"Car Loan","CL",1213L),
			new Loan(1003L,"Personal Loan","Personal",1214L),
			new Loan(1004L,"Home Loan","HL",1215L)
			);

	@Override
	public List<Loan> getLoaninfoOfUser(Long userId) {
		return list.stream().filter(loan->loan.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
