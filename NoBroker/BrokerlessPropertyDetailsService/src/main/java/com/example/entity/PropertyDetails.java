package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "property_details_tab")
@Setter @Getter @ToString @Builder
@AllArgsConstructor 
@NoArgsConstructor
public class PropertyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
	@Column(updatable = false)
	@CreationTimestamp
	private Date createdOn;
	
	private String updatedBy;
	
	@Column(insertable = false)
	@UpdateTimestamp
	private Date updatedOn;
	
	private String userStatus;
}
