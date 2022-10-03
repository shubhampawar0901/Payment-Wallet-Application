package com.masai.service;

import com.masai.DTO.LoginDTO;
import com.masai.entity.CurrentUserSession;

public interface LoginServices {

	public CurrentUserSession loginService(LoginDTO logindto);
	
	public String logOutService(String key);
}
