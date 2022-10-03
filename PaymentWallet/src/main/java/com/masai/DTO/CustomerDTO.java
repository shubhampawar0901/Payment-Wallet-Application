package com.masai.DTO;


public class CustomerDTO {

	private String pancard;
	private String name;
	private Double balance;
	public CustomerDTO() {
		super();
	}
	public CustomerDTO(String pancard, String name, Double balance) {
		super();
		this.pancard = pancard;
		this.name = name;
		this.balance = balance;
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
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "CustomerDTO [pancard=" + pancard + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
