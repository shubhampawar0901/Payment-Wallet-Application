package com.masai.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.entity.Transaction;
import com.masai.exceptionHandler.TransactionsNotFoundException;
import com.masai.repository.TransactionDao;

public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionDao transactionDao;
	
	@Override
	public List<Transaction> getAllTransactions() throws TransactionsNotFoundException {
		List<Transaction> list = transactionDao.findAll();
		
		if(list.size()>0) { 
			return list;
		}
		throw new TransactionsNotFoundException("No Transactions Found...");
	}

	@Override
	public List<Transaction> getTransactionByDate(Date date, String key) {
		List<Transaction> list = transactionDao.findByDate(date);
		if(list.size()>0) { 
			return list;
		}
		throw new TransactionsNotFoundException("No Transactions Found...");
	}

}
