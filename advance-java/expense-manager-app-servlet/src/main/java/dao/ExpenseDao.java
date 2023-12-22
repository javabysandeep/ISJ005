package dao;

import configuration.ConnectionUtil;
import model.Expense;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDao {
    public void addExpense(Expense expense) {
        Connection connection = ConnectionUtil.getConnection();
        String insertQuery = "insert into expense_manager_app.expense(remark, amount, payment_mode, date) values (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, expense.getRemark());
            preparedStatement.setInt(2, expense.getAmount());
            preparedStatement.setString(3, expense.getPaymentMode());
            preparedStatement.setTimestamp(4, Timestamp.valueOf(expense.getTime()));

            preparedStatement.executeUpdate();
            System.out.println("Expense added successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Expense> getAllExpenses() {
        List<Expense> expenseList = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from expense_manager_app.expense";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Expense expense = Expense.builder()
                        .id(resultSet.getInt("id"))
                        .remark(resultSet.getString("remark"))
                        .amount(resultSet.getInt("amount"))
                        .paymentMode(resultSet.getString("payment_mode"))
                        .time(resultSet.getTimestamp("date").toLocalDateTime())
                        .build();
                expenseList.add(expense);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return expenseList;
    }
}
