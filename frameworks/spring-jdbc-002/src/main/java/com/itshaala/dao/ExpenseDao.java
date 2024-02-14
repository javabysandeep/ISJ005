package com.itshaala.dao;

import com.itshaala.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class ExpenseDao {
    JdbcTemplate jdbcTemplate;

    public void addExpense(Expense expense) {
        String sql = "insert into itshaala_pro.expense(id, expense, amount, date_time, description) values (?,?,?,?,?)";
        jdbcTemplate.update(sql, preparedStatement -> {
            preparedStatement.setInt(1, expense.getId());
            preparedStatement.setString(2, expense.getExpense());
            preparedStatement.setInt(3, expense.getAmount());
            preparedStatement.setDate(4, expense.getDateTime());
            preparedStatement.setString(5, expense.getDescription());
        });
        System.out.println("expense created");
    }

    public void updateExpense(Expense expense) {
        String sql = "update itshaala_pro.expense set expense=?,amount=?,date_time=?, description=? where id=?";
        jdbcTemplate.update(sql, preparedStatement -> {
            preparedStatement.setString(1, expense.getExpense());
            preparedStatement.setInt(2, expense.getAmount());
            preparedStatement.setDate(3, expense.getDateTime());
            preparedStatement.setString(4, expense.getDescription());
            preparedStatement.setInt(5, expense.getId());
        });
        System.out.println("expense updated");
    }

    public void deleteExpense(int expenseId) {
        String sql = "delete from itshaala_pro.expense where id=?";
        jdbcTemplate.update(sql, preparedStatement -> {
            preparedStatement.setInt(1, expenseId);
        });
        System.out.println("expense deleted");
    }

    public Expense getExpenseById(int expenseId) {
        String sql = "select * from itshaala_pro.expense where id=?";
        return null;
    }

    public List<Expense> getAllExpenses() {
        return null;
    }


}
