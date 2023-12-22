package service;

import dao.ExpenseDao;
import model.Expense;

import java.util.List;

public class ExpenseService {
    ExpenseDao expenseDao = new ExpenseDao();

    public void addExpense(Expense expense) {
        expenseDao.addExpense(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseDao.getAllExpenses();
    }
}
