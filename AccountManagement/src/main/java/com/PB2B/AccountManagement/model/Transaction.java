package com.PB2B.AccountManagement.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "Transaction",uniqueConstraints = @UniqueConstraint(columnNames = "account_no"))
public class Transaction{
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long transaction_Id;
	
	@Column(name = "timeStamp")
	private  Timestamp timeStamp;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "amount")
	private long amount;
	
	@Column(name = "debitFromAccount")
	private String debitFromAccount;
	
	@Column(name = "creditToAccount")
	private String creditToAccount;
	
	public long getTransaction_Id() {
		return transaction_Id;
	}

	public void setTransaction_Id(long transaction_Id) {
		this.transaction_Id = transaction_Id;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getDebitFromAccount() {
		return debitFromAccount;
	}

	public void setDebitFromAccount(String debitFromAccount) {
		this.debitFromAccount = debitFromAccount;
	}

	public String getCreditToAccount() {
		return creditToAccount;
	}

	public void setCreditToAccount(String creditToAccount) {
		this.creditToAccount = creditToAccount;
	}

	
}