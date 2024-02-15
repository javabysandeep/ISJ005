package com.itshaala.dao;

import com.itshaala.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class ExpenseDao {
    JdbcTemplate jdbcTemplate;

    public void addExpense(Expense expense) {
        String sql = "insert into itshaala_pro.expense(id, expense, amount, date_time, description) values (?,?,?,?,?)";
        PreparedStatementSetter preparedStatementSetter = preparedStatement -> {
            preparedStatement.setInt(1, expense.getId());
            preparedStatement.setString(2, expense.getExpense());
            preparedStatement.setInt(3, expense.getAmount());
            preparedStatement.setDate(4, expense.getDateTime());
            preparedStatement.setString(5, expense.getDescription());
        };
        jdbcTemplate.update(sql, preparedStatementSetter);
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
        String sql = "select * from itshaala_pro.expense where id=" + expenseId;
        //String sql = "select * from itshaala_pro.expense where id=?";

        RowMapper<Expense> rowMapper = ((rs, rowNum) -> Expense.builder()
                .id(rs.getInt("id"))
                .expense(rs.getString("expense"))
                .amount(rs.getInt("amount"))
                .description(rs.getString("description"))
                .dateTime(rs.getDate("date_time"))
                .build());
        return jdbcTemplate.queryForObject(sql, rowMapper);
    }

    public List<Expense> getAllExpenses() {
        String sql = "select * from itshaala_pro.expense";
        ResultSetExtractor<List<Expense>> resultSet = (rs -> {
            List<Expense> expenseList = new ArrayList<>();
            while (rs.next()) {
                Expense expense = Expense.builder()
                        .id(rs.getInt("id"))
                        .expense(rs.getString("expense"))
                        .amount(rs.getInt("amount"))
                        .description(rs.getString("description"))
                        .dateTime(rs.getDate("date_time"))
                        .build();
                expenseList.add(expense);
            }
            return expenseList;
        });
        return jdbcTemplate.query(sql, resultSet);
    }

}
