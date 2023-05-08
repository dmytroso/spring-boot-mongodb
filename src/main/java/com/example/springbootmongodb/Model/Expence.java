package com.example.springbootmongodb.Model;

import java.math.BigDecimal;

public class Expence {
    private String id;
    private String expenceName;

    public Expence(String id, String expenceName, ExpenseCategory expenseCategory, BigDecimal expenceAmount) {
        this.id = id;
        this.expenceName = expenceName;
        this.expenseCategory = expenseCategory;
        this.expenceAmount = expenceAmount;
    }

    private ExpenseCategory expenseCategory;
    private BigDecimal expenceAmount;
}
