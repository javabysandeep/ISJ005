package com.itshaala.springbootexpensemanager009.controller;

import com.itshaala.springbootexpensemanager009.model.Expense;
import com.itshaala.springbootexpensemanager009.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")
@AllArgsConstructor
public class ExpenseController {
    ExpenseService expenseService;

    @PostMapping
    public void addExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
    }

    @PutMapping
    public void updateExpense(@RequestBody Expense expense) {
        expenseService.updateExpense(expense);
    }

    @DeleteMapping
    public void deleteExpense(@RequestBody Expense expense) {
        expenseService.deleteExpense(expense);
    }

    @GetMapping("/{id}")
    public Expense getExpenseById(@PathVariable("id") int expenseId) {
        return expenseService.getExpenseById(expenseId);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        List<Expense> expenseList = expenseService.getAllExpenses();
        expenseList.forEach(System.out::println);
        return expenseList;
    }
}
