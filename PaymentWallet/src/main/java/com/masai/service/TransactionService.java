package com.masai.service;

import java.util.Date;
import java.util.List;

import com.masai.entity.Transaction;
import com.masai.exceptionHandler.TransactionsNotFoundException;

public interface TransactionService {
	
	public List<Transaction> getAllTransactions() throws TransactionsNotFoundException;
	
	public List<Transaction> getTransactionByDate(Date date, String key);

}
