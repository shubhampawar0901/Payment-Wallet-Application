package com.masai.entity;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

public class Wallet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long walletID;
	
	@Min(value=0, message = "Balance should be greater than 0")
	private double balance;
	
	@OneToMany(targetEntity = Transaction.class, cascade = CascadeType.ALL)
	@JoinColumn(name="WalletID",referencedColumnName = "TransactionID")
	private List<Transaction> transactions;

	public Wallet() {
		super();

	}

	public Wallet(long walletID, @Min(value = 0, message = "Balance should be greater than 0") double balance,
			List<Transaction> transactions) {
		super();
		this.walletID = walletID;
		this.balance = balance;
		this.transactions = transactions;
	}

	public long getWalletID() {
		return walletID;
	}

	public void setWalletID(long walletID) {
		this.walletID = walletID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Wallet [walletID=" + walletID + ", balance=" + balance + ", transactions=" + transactions + "]";
	}
	
	

}
