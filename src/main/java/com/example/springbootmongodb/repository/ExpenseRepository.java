package com.example.springbootmongodb.repository;

import com.example.springbootmongodb.Model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
