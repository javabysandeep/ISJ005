package com.itshaala.controller;

import com.itshaala.model.Expense;
import com.itshaala.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ExpenseController {

    ExpenseService expenseService;

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
