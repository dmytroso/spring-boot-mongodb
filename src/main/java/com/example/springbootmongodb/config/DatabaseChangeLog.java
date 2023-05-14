package com.example.springbootmongodb.config;

import com.example.springbootmongodb.Model.Expense;
import com.example.springbootmongodb.Model.ExpenseCategory;
import com.github.cloudyrock.mongock.ChangeLog;
import io.mongock.api.annotations.ChangeUnit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ChangeUnit(id = "DatabaseChangeLog", order = "1", author = "dmytroso")
public class DatabaseChangeLog {
    public void seedDataBase() {
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(createNewExpense("Movie Tickets", ExpenseCategory.ENTERTAINMENT, BigDecimal.valueOf(40)));
        expenseList.add(createNewExpense("Dinner", ExpenseCategory.RESTAURANT, BigDecimal.valueOf(60)));
        expenseList.add(createNewExpense("Netflix", ExpenseCategory.ENTERTAINMENT, BigDecimal.valueOf(10)));
        expenseList.add(createNewExpense("Gym", ExpenseCategory.MISC, BigDecimal.valueOf(20)));
        expenseList.add(createNewExpense("Internet", ExpenseCategory.UTILITIES, BigDecimal.valueOf(30)));
    }

    private Expense createNewExpense(String expenseName, ExpenseCategory expenseCategory, BigDecimal expenseAmount) {
        Expense expense = new Expense();
        expense.setExpenseName(expenseName);
        expense.setExpenseCategory(expenseCategory);
        expense.setExpenseAmount(expenseAmount);
        return expense;
    }

}
