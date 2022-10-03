package com.masai.service;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.masai.DTO.LoginDTO;
import com.masai.entity.CurrentUserSession;
import com.masai.entity.Customer;
import com.masai.exceptionHandler.CustomerNotFoundException;
import com.masai.repository.CurrentUserSessionDao;
import com.masai.repository.CustomerDao;

import net.bytebuddy.utility.RandomString;

public class LoginServiceImpl implements LoginServices {

	@Autowired
	private CurrentUserSessionDao userSessionDao;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public CurrentUserSession loginService(LoginDTO logindto) {
		Optional<CurrentUserSession> opt=userSessionDao.findById(logindto.getPancard());
		if(opt.isPresent()) {
		
			LocalDateTime prev = opt.get().getLocalDateTime();
			LocalDateTime current = LocalDateTime.now();
			
			if(prev.getDayOfMonth()==current.getDayOfMonth()) {
				return opt.get();
			}else {
				userSessionDao.delete(opt.get());
				loginService(logindto);
			}
		}
		
	   Optional<Customer> customer=customerDao.findById(logindto.getPancard());
	   customer.orElseThrow(()->new CustomerNotFoundException("Customer not found with given Id.."));
	   
	   if(customer.get().getPancard().equals(logindto.getPancard())&&
			   customer.get().getPassword().equals(logindto.getPasswaord())) {
		   return userSessionDao.save(new CurrentUserSession(logindto.getPancard(),LocalDateTime.now(),RandomString.make(10)));
	   }else {
		   throw new CustomerNotFoundException("Something went wrong..");
	   }
		
	}

	@Override
	public String logOutService(String key) {
		
		CurrentUserSession user = userSessionDao.findByUuid(key);
		if(user!=null) {
			userSessionDao.delete(user);
			return "Logout Successfully...";
		}else {
			throw new CustomerNotFoundException("User not found in Session..");
		}
		
	}


}
