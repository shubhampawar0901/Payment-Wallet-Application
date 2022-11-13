package com.masai.repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Transaction;

@Repository
public interface TransactionDao extends JpaRepository<Transaction, Long> {
	
	public List<Transaction> findByDate(Date date);
}
