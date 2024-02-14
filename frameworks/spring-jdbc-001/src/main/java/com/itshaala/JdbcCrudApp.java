package com.itshaala;

import com.itshaala.controller.ExpenseController;
import com.itshaala.model.Expense;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Hello world!
 */
public class JdbcCrudApp {
    public static void main(String[] args) {
        ExpenseController expenseController = new ExpenseController();
        /*expenseController.addExpense(Expense.builder()
                .id(1003)
                .expense("Lunch")
                .amount(899)
                .dateTime(Date.valueOf(LocalDate.now()))
                .description("Little Italy")
                .build());*/

       /* expenseController.updateExpense(Expense.builder()
                .id(1001)
                .expense("fuel")
                .amount(400)
                .dateTime(Date.valueOf(LocalDate.now()))
                .description("Petrol at Pune University Pump")
                .build());*/
        //System.out.println(expenseController.getExpenseById(1002));
        //expenseController.deleteExpense(1001);
        expenseController.getAllExpenses().forEach(System.out::println);
    }
}
