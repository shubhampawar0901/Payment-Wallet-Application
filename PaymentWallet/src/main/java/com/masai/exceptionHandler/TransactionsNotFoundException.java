package com.masai.exceptionHandler;

public class TransactionsNotFoundException extends RuntimeException {

	public TransactionsNotFoundException(){
		
	}
	public TransactionsNotFoundException(String message){
		super(message);
	}
}
