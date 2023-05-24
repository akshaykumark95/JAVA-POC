package com.neo.main.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Long userId;
	private String name;
	private String phone;
	
	List<Loan> loan=new ArrayList<>();

	public User(Long userId, String name, String phone, List<Loan> loan) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.loan = loan;
	}

	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public User() {
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}
	
	
	
	

}
