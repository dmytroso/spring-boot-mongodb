package com.example.springbootmongodb.service;

import com.example.springbootmongodb.Model.Expense;
import com.example.springbootmongodb.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(Expense expense) {
        expenseRepository.insert(expense);
    }
    public void updateExpense(Expense expense) {
        Expense savedExxpense = expenseRepository.findById(expense.getId())
                .orElseThrow(() -> new RuntimeException(String.format("Cannot Find by ID %s", expense.getId())));

        savedExxpense.setExpenseName(expense.getExpenseName());
        savedExxpense.setExpenseAmount(expense.getExpenseAmount());
        savedExxpense.setExpenseCategory(expense.getExpenseCategory());

        expenseRepository.save(expense);
    }

    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }
    public Expense getExpenseByName(String name) {
        return expenseRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Expense by Name %s", name)));
    }

    public void deleteExpense(String id) {
        expenseRepository.deleteById(id);
    }
}
