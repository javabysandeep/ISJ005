package oops.inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        SavingsBankAccount sb = new SavingsBankAccount();
        CurrentBankAccount cb = new CurrentBankAccount();
        sb.deposit();
        cb.deposit();
    }
}
