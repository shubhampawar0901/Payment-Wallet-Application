package com.masai.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginDTO {
	@Size(min=10,max=10)
	@Pattern(regexp="([A-Z]{5}[0-9]{4}[A-Z]{1})", message = "Please,enter valid pancard number")
	private String pancard;
	@NotNull
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Please,enter valid password")
	private String passwaord;
	public LoginDTO() {
		super();
	}
	public LoginDTO(
			@Size(min = 10, max = 10) @Pattern(regexp = "([A-Z]{5}[0-9]{4}[A-Z]{1})", message = "Please,enter valid pancard number") String pancard,
			@NotNull @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Please,enter valid password") String passwaord) {
		super();
		this.pancard = pancard;
		this.passwaord = passwaord;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getPasswaord() {
		return passwaord;
	}
	public void setPasswaord(String passwaord) {
		this.passwaord = passwaord;
	}
	@Override
	public String toString() {
		return "LoginDTO [pancard=" + pancard + ", passwaord=" + passwaord + "]";
	}
	
	
}
