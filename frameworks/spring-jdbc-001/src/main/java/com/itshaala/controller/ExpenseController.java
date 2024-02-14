package com.itshaala.controller;

import com.itshaala.model.Expense;
import com.itshaala.service.ExpenseService;

import java.util.List;

public class ExpenseController {

    ExpenseService expenseService = new ExpenseService();

    public void addExpense(Expense expense) {
        expenseService.addExpense(expense);
    }

    public void updateExpense(Expense expense) {
        expenseService.updateExpense(expense);
    }

    public void deleteExpense(int expenseId) {
        expenseService.deleteExpense(expenseId);
    }

    public Expense getExpenseById(int expenseId) {
        return expenseService.getExpenseById(expenseId);
    }

    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }
}
