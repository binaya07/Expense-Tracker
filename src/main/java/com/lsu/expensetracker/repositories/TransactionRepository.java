package com.lsu.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsu.expensetracker.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}