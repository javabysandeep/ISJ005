package classComponents.methods;

public class BankAccount {
    int customerId;
    int accountNumber;
    String accountHolderName;
    double balance;
    static String BANK_NAME = "SBI";

    double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        return balance;
    }

    double withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
        return balance;
    }

    double getBalance() {
        return balance;
    }

    static String getBankDetails() {
        return "SBI-Shivajinagar-branch-pune-maharashtra-411004";
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.customerId = 1;
        bankAccount.accountNumber = 1;
        bankAccount.accountHolderName = "Vijay Mallya";
        bankAccount.balance = 0;

        bankAccount.deposit(10000);
        System.out.println("Available Balance " + bankAccount.getBalance());

        bankAccount.withdraw(9999);
        System.out.println("After withdrawl ");
        System.out.println("Available Balance " + bankAccount.getBalance());

        System.out.println("Bank details " + getBankDetails());
    }
}
