package com.masai.entity;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long transactionID;
	
	@NotNull
	private String transactionType;
	
	@NotNull
	private LocalDateTime localDateTime;
	
	@NotNull
	private Double amount;
	
	private String description;

	public Transaction() {
		super();
	}

	public Transaction(Long transactionID, @NotNull String transactionType, @NotNull LocalDateTime localDateTime,
			@NotNull Double amount, String description) {
		super();
		this.transactionID = transactionID;
		this.transactionType = transactionType;
		this.localDateTime = localDateTime;
		this.amount = amount;
		this.description = description;
	}

	public Long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(Long transactionID) {
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
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
