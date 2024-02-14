package com.itshaala.service;

import com.itshaala.dao.ExpenseDao;
import com.itshaala.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExpenseService {

    ExpenseDao expenseDao;

    public void addExpense(Expense expense) {
        expenseDao.addExpense(expense);
    }

    public void updateExpense(Expense expense) {
        expenseDao.updateExpense(expense);
    }

    public void deleteExpense(int expenseId) {
        expenseDao.deleteExpense(expenseId);
    }

    public Expense getExpenseById(int expenseId) {
        return expenseDao.getExpenseById(expenseId);
    }

    public List<Expense> getAllExpenses() {
        return expenseDao.getAllExpenses();
    }
}
