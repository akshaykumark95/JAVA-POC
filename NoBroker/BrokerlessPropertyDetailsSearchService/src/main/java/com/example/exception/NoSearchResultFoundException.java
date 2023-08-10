package com.example.exception;

public class NoSearchResultFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public NoSearchResultFoundException() {

	}

	public NoSearchResultFoundException(String msg) {
		super(msg);
	}
}
