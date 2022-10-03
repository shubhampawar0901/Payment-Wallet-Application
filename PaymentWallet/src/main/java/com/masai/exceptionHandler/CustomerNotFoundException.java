package com.masai.exceptionHandler;

public class CustomerNotFoundException extends RuntimeException{

	public CustomerNotFoundException() {
		
	}
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
