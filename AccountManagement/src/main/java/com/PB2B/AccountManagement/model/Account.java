package com.PB2B.AccountManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Account",uniqueConstraints = @UniqueConstraint(columnNames = "customer_id"))
public class Account{
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
//	@Size(min = 3, max = 15)
	private long account_no;
	
	@Column(name = "currentBalance")
	private String currentBalance;
	
	private String customer_id;

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public String getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	

	

	
	
}