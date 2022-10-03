package com.masai.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class CurrentUserSession {

	@Id
	@Size(min=10,max=10)
	@Pattern(regexp="([A-Z]{5}[0-9]{4}[A-Z]{1})", message = "Please,enter valid pancard number")
	private String pancard;
    private LocalDateTime localDateTime;
    @Column(unique = true)
    private String uuid;

	public CurrentUserSession() {
		super();
	}

	public CurrentUserSession(
			@Size(min = 10, max = 10) @Pattern(regexp = "([A-Z]{5}[0-9]{4}[A-Z]{1})", message = "Please,enter valid pancard number") String pancard,
			LocalDateTime localDateTime, String uuid) {
		super();
		this.pancard = pancard;
		this.localDateTime = localDateTime;
		this.uuid = uuid;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "CurrentUserSession [pancard=" + pancard + ", localDateTime=" + localDateTime + ", uuid=" + uuid + "]";
	}
	    
}
