package com.masai.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BeneficiaryInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long benificiaryID;
	
	private String name;
	
	private String mobileNumber;
	
	@ManyToOne(targetEntity = Wallet.class, cascade = CascadeType.ALL)
	@JoinColumn(name="walletID")
	private Wallet wallet;

	public BeneficiaryInfo() {
		super();
		
	}

	public BeneficiaryInfo(Long benificiaryID, String name, String mobileNumber, Wallet wallet) {
		super();
		this.benificiaryID = benificiaryID;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.wallet = wallet;
	}

	public Long getBenificiaryID() {
		return benificiaryID;
	}

	public void setBenificiaryID(Long benificiaryID) {
		this.benificiaryID = benificiaryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "BeneficiaryInfo [benificiaryID=" + benificiaryID + ", name=" + name + ", mobileNumber=" + mobileNumber
				+ ", wallet=" + wallet + "]";
	}

	
	
	
}
