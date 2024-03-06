package com.itshaala.springbootexpensemanager009.service;

import com.itshaala.springbootexpensemanager009.dao.ExpenseRepository;
import com.itshaala.springbootexpensemanager009.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExpenseService {
    ExpenseRepository expenseRepository;

    public void addExpense(Expense expense) {
        expenseRepository.save(expense);
    }

   public void updateExpense(Expense expense) {
        expenseRepository.save(expense);
    }

   public void deleteExpense(Expense expense) {
        expenseRepository.delete(expense);
    }

   public Expense getExpenseById(int expenseId) {
        return expenseRepository.findById(expenseId).get();
    }

   public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
