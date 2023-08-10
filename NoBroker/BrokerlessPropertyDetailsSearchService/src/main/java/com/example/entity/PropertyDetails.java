package com.example.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor 
@NoArgsConstructor
public class PropertyDetails {
	private String city;
	private String localities;
	private String propertyType;
	private String bhkType;
	private Double rentAmt;
	private String availability;
	private String furnishedType;
	private Long mobileContact;
	private Integer builtUpArea;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;
	private String userStatus;
}
