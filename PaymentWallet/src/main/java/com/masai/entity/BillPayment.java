package com.masai.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

public class BillPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long billId;
	@NotNull
	private Double amount;
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

	public BillPayment(Long billId, @NotNull Double amount, @NotNull String billType,
			@NotNull LocalDateTime localDateTime, Wallet wallet) {
		super();
		this.billId = billId;
		this.amount = amount;
		this.billType = billType;
		this.localDateTime = localDateTime;
		this.wallet = wallet;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
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
		return "BillPayment [billId=" + billId + ", amount=" + amount + ", billType=" + billType + ", localDateTime="
				+ localDateTime + ", wallet=" + wallet + "]";
	}

	
}
