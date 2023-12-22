package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Expense;
import service.ExpenseService;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet("/expense")
public class ExpenseController extends HttpServlet {
    private ExpenseService expenseService = new ExpenseService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Expense> expenseList = expenseService.getAllExpenses();
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<table border: 10px solid black><tr><th>ID</th> <th>Remark</th> <th>Amount</th> <th>Payment Mode</th> <th>Time</th></tr>");
        for (Expense expense : expenseList) {
            writer.println("<tr>");
            writer.println("<td>" + expense.getId() + "</td>");
            writer.println("<td>" + expense.getRemark() + "</td>");
            writer.println("<td>" + expense.getAmount() + "</td>");
            writer.println("<td>" + expense.getPaymentMode() + "</td>");
            writer.println("<td>" + expense.getTime() + "</td>");
            writer.println("</tr>");
        }
        writer.println("</table>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String remark = req.getParameter("remark");
        int amount = Integer.parseInt(req.getParameter("amount"));
        String paymentMode = req.getParameter("paymentMode");
        LocalDateTime time = LocalDateTime.parse(req.getParameter("time"));

        Expense expense = Expense.builder().amount(amount).remark(remark).paymentMode(paymentMode).time(time).build();

        expenseService.addExpense(expense);

        PrintWriter writer = resp.getWriter();
        writer.println("Expense added successfully");

    }
}
