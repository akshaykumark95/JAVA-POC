package com.neo.main.model;

public class Loan {
	
	private Long loanId;
	private String loanName;
	private String type;
	private Long userId;
	public Loan(Long loanId, String loanName, String type, long userId) {
		super();
		this.loanId = loanId;
		this.loanName = loanName;
		this.type = type;
		this.userId = userId;
	}
	public Loan() {
		
	}
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
	

}
