package com.masai.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

public class BillPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long billId;
	@NotNull
	private double amount;
	@NotNull
	private String billType;
	@NotNull
	private LocalDateTime localDateTime;
	
	@ManyToOne(targetEntity = Wallet.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "walletId")
	private Wallet wallet;
	
	public BillPayment() {
		super();
	}

	public BillPayment(long billId, @NotNull String billType, @NotNull double amount,
			@NotNull LocalDateTime localDateTime, Wallet wallet) {
		super();
		this.billId = billId;
		this.billType = billType;
		this.amount = amount;
		this.localDateTime = localDateTime;
		this.wallet = wallet;
	}

	public long getBillId() {
		return billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "BillPayment [billId=" + billId + ", billType=" + billType + ", amount=" + amount + ", localDateTime="
				+ localDateTime + ", wallet=" + wallet + "]";
	}
	
	
	
	
}
