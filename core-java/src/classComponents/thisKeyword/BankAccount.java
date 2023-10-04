package classComponents.thisKeyword;

public class BankAccount {
    int bankAccountNumber;
    String bankAccountHolderName;
    double balance;

    BankAccount() {
        this(10,"abc",450);
        System.out.println("zero param or no-args constructor");
    }

    //parameterized constructor
    BankAccount(int bankAccountNumber, String bankAccountHolderName, double balance) {
        //this();//this is call to the same class zero param construtor
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
        this.balance = balance;
    }

}
