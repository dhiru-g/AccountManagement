package com.PB2B.AccountManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User{
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long user_id;
	
	@Column(name = "userName")
	private String userName;
	
//	@Column(name = "userName")
//	private String userName;
	

	
	
}