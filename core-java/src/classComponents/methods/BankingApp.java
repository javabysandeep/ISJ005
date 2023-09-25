package classComponents.methods;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.customerId = 1;
        bankAccount.accountNumber = 1;
        bankAccount.accountHolderName ="Vijay Mallya";
        bankAccount.balance = 0;

        bankAccount.deposit(10000);
        System.out.println("Available Balance "+ bankAccount.getBalance());

        bankAccount.withdraw(9999);
        System.out.println("After withdrawl ");
        System.out.println("Available Balance "+ bankAccount.getBalance());

        System.out.println("Bank details "+BankAccount.getBankDetails());
    }
}
