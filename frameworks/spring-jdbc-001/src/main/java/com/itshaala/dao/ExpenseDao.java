package com.itshaala.dao;

import com.itshaala.model.Expense;
import com.itshaala.util.JdbcConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDao {
    public void addExpense(Expense expense) {
        Connection connection = JdbcConfiguration.getConnection();
        String sql = "insert into itshaala_pro.expense(id, expense, amount, date_time, description) values (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, expense.getId());
            preparedStatement.setString(2, expense.getExpense());
            preparedStatement.setInt(3, expense.getAmount());
            preparedStatement.setDate(4, expense.getDateTime());
            preparedStatement.setString(5, expense.getDescription());
            preparedStatement.executeUpdate();
            System.out.println("Expense Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void updateExpense(Expense expense) {
        Connection connection = JdbcConfiguration.getConnection();
        String sql = "update itshaala_pro.expense set expense=?,amount=?,date_time=?, description=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, expense.getExpense());
            preparedStatement.setInt(2, expense.getAmount());
            preparedStatement.setDate(3, expense.getDateTime());
            preparedStatement.setString(4, expense.getDescription());
            preparedStatement.setInt(5, expense.getId());
            preparedStatement.executeUpdate();
            System.out.println("Expense Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Expense getExpenseById(int expenseId) {
        Connection connection = JdbcConfiguration.getConnection();
        String sql = "select * from itshaala_pro.expense where id=?";
        Expense expense = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, expenseId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                expense = Expense.builder()
                        .id(resultSet.getInt("id"))
                        .expense(resultSet.getString("expense"))
                        .amount(resultSet.getInt("amount"))
                        .dateTime(resultSet.getDate("date_time"))
                        .description(resultSet.getString("description"))
                        .build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return expense;
    }

    public List<Expense> getAllExpenses() {
        Connection connection = JdbcConfiguration.getConnection();
        String sql = "select * from itshaala_pro.expense";
        List<Expense> expenseList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Expense expense = Expense.builder()
                        .id(resultSet.getInt("id"))
                        .expense(resultSet.getString("expense"))
                        .amount(resultSet.getInt("amount"))
                        .dateTime(resultSet.getDate("date_time"))
                        .description(resultSet.getString("description"))
                        .build();
                expenseList.add(expense);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return expenseList;
    }

    public void deleteExpense(int expenseId) {
        Connection connection = JdbcConfiguration.getConnection();
        String sql = "delete from itshaala_pro.expense where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, expenseId);
            preparedStatement.executeUpdate();
            System.out.println("Expense Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
