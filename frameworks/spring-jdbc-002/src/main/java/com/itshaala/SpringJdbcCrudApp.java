package com.itshaala;

import com.itshaala.controller.ExpenseController;
import com.itshaala.model.Expense;
import com.itshaala.util.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Hello world!
 */
public class SpringJdbcCrudApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ExpenseController expenseController = applicationContext.getBean(ExpenseController.class);
/*        expenseController.addExpense(Expense.builder()
                .id(1006)
                .expense("Cloud Bills")
                .amount(1799)
                .dateTime(Date.valueOf(LocalDate.now()))
                .description("Google Cloud")
                .build());*/

       /* expenseController.updateExpense(Expense.builder()
                .id(1005)
                .expense("Cloud database Bills for Feb 20204")
                .amount(7920)
                .dateTime(Date.valueOf(LocalDate.now()))
                .description("GCP")
                .build());*/
        //System.out.println(expenseController.getExpenseById(1002));
      //  expenseController.deleteExpense(1002);
        // expenseController.getAllExpenses().forEach(System.out::println);
        //System.out.println(expenseController.getExpenseById(1006));
        expenseController.getAllExpenses().forEach(System.out::println);
    }
}
