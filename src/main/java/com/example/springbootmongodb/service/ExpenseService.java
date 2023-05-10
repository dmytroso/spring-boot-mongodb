package com.example.springbootmongodb.service;

import com.example.springbootmongodb.Model.Expense;
import com.example.springbootmongodb.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(Expense expense) {
        expenseRepository.insert(expense);
    }
    public void updateExpense() {}
    public void getAllExpense() {}
    public void getExpenseByName() {}
    public void deleteExpense() {}
}
