package com.masai.entity;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long transactionID;
	
	@NotNull
	private String transactionType;
	
	@NotNull
	private LocalDateTime localDateTime;
	
	@NotNull
	private double amount;
	
	private String description;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(long transactionID, @NotNull String transactionType, @NotNull LocalDateTime localDateTime,
			@NotNull double amount, String description) {
		super();
		this.transactionID = transactionID;
		this.transactionType = transactionType;
		this.localDateTime = localDateTime;
		this.amount = amount;
		this.description = description;
	}

	public long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", transactionType=" + transactionType
				+ ", localDateTime=" + localDateTime + ", amount=" + amount + ", description=" + description + "]";
	}
	
	
	
	
}
