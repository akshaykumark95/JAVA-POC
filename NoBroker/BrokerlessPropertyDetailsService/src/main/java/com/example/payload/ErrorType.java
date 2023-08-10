package com.example.payload;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorType implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String error;
	private String msg;
	private String date;
}
