package Homework;

public class BankAccount {
    private String customerName;
    private String accountNumber;
    private double balance;

    BankAccount(String customerName, String accountNumber, double balance) {

    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double b) {
        this.balance = b;
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Withdraw Failed!!");
            System.out.println("#######\n");
        } else {
            System.out.println("Withdraw Complete!!");
            System.out.printf("%s %s Deposit %f Balance %.6f \n ", getAccountNumber(), getCustomerName(), amount,
                    getBalance() - amount);
            setBalance(amount - getBalance());
            System.out.println("#######\n");
        }
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit Failed!!");
            System.out.println("#######\n");
        } else {
            System.out.println("Deposit Complete!!");
            System.out.printf("%s %s Deposit %.2f Balance %.6f\n", getAccountNumber(), getCustomerName(), amount,
                    amount + getBalance());
            setBalance(amount + getBalance());
            System.out.println("#######\n");
        }
    }

}
