package classComponents.methods.cashBook;

public class CashBookApp {
    public static void main(String[] args) {
        Income income1 = new Income();
        income1.incomeId = 1;
        income1.incomeAmount = 10000;
        income1.incomeDescription = "gifts";

        Income income2 = new Income();
        income2.incomeId = 2;
        income2.incomeAmount = 900;
        income2.incomeDescription = "gifts";

        Expense expense = new Expense();
        expense.expenseId = 1;
        expense.expenseAmount = 200;
        expense.expenseDescription = "auto";

        System.out.println("Net balance " + (income1.incomeAmount + income2.incomeAmount - expense.expenseAmount));
    }
}
