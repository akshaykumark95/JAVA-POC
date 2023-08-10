package com.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "user_info_tab")
@Setter @Getter @Builder @ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usrId;
	private String usrName;
	private String usrEmail;
	private String usrPassword;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(joinColumns = @JoinColumn(name = "usrId"))
	private List<String> usrRoles;
	
	private String createdBy;
	@CreationTimestamp
	@Column(updatable = false)
	private Date createdOn;
	
	private String updatedBy;
	@UpdateTimestamp
	@Column(insertable = false)
	private Date updatedOn;
	
	private String usrStatus;
}
