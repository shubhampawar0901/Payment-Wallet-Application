package com.masai.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class BankAccount {

	@Id
	@Size(min = 11, max = 16)
	private int bankAccountNo ;
	
	@NotNull
	@Pattern(regexp ="[A-Z]{4}0[A-Z0-9]{6}$")
	private String IFSCcode;
	
	@NotNull
	private String bankName;
	
	@NotNull
	@Min(0)
	private double bankBallance;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Wallet wallet;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public BankAccount(@Size(min = 11, max = 16) int bankAccountNo,
			@NotNull @Pattern(regexp = "[A-Z]{4}0[A-Z0-9]{6}$") String iFSCcode, @NotNull String bankName,
			@NotNull @Min(0) double bankBallance, Wallet wallet) {
		super();
		this.bankAccountNo = bankAccountNo;
		IFSCcode = iFSCcode;
		this.bankName = bankName;
		this.bankBallance = bankBallance;
		this.wallet = wallet;
	}

	public int getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(int bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getIFSCcode() {
		return IFSCcode;
	}

	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getBankBallance() {
		return bankBallance;
	}

	public void setBankBallance(double bankBallance) {
		this.bankBallance = bankBallance;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccountNo=" + bankAccountNo + ", IFSCcode=" + IFSCcode + ", bankName=" + bankName
				+ ", bankBallance=" + bankBallance + ", wallet=" + wallet + "]";
	}
	
	
}
