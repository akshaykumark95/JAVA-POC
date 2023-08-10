package com.example.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.exception.NoSearchResultFoundException;
import com.example.payload.ErrorType;

@RestControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(NoSearchResultFoundException.class)
	public ResponseEntity<ErrorType> resultNotFoundException(NoSearchResultFoundException ex){
		return new ResponseEntity<ErrorType>(new ErrorType("No Result Found With Give Search Fields", ex.getMessage(), new Date().toString()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
