package com.masai.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
public class Customer {

	@Id
	@Size(min=10,max=10)
	@Pattern(regexp="([A-Z]{5}[0-9]{4}[A-Z]{1})", message = "Please,enter valid pancard number")
	private String pancard;
	@NotNull
	private String name;
	@NotNull
	@Pattern(regexp="(^$|[0-9]{10})", message = "Please,enter 10 digits mobile number")
	private long mobileNum;
	@NotNull
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Please,enter valid password")
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	private Wallet wallet;
	
	public Customer() {
		super();
	}
	public Customer(String pancard, String name, long mobileNum, String password, Wallet wallet) {
		super();
		this.pancard = pancard;
		this.name = name;
		this.mobileNum = mobileNum;
		this.password = password;
		this.wallet = wallet;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "Customer [pancard=" + pancard + ", name=" + name + ", mobileNum=" + mobileNum + ", password=" + password
				+ ", wallet=" + wallet + "]";
	}
	
	
	
}
