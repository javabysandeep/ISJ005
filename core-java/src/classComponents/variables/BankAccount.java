package classComponents.variables;

public class BankAccount {
    int customerId;
    int accountNumber;
    String accountHolderName;
    float balance;
    static String BANK_NAME = "SBI";

    public static void main(String[] args) {
        System.out.println("main method");
        BankAccount bankAccount = new BankAccount();
        bankAccount.customerId = 1;
        bankAccount.accountNumber = 1;
        bankAccount.accountHolderName = "abc";
        bankAccount.balance = 100f;

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.customerId = 2;
        bankAccount1.accountNumber = 2;
        bankAccount1.accountHolderName = "pqr";
        bankAccount1.balance = 200f;

        int a = 100; //local variable

    }
}
