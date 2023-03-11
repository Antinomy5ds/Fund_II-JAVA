package Homework;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(null, null, 0);
        BankAccount b2 = new BankAccount(null, null, 0);
        CheckingAccount c1 = new CheckingAccount(null, null, 0, 0);
        CheckingAccount c2 = new CheckingAccount(null, null, 0, 0);
        Scanner scan = new Scanner(System.in);

        System.out.println("#1 BankAccount1");
        System.out.print("NAMR: ");
        String name = scan.nextLine();
        b1.setCustomerName(name);
        System.out.print("ADDR: ");
        String ad = scan.nextLine();
        b1.setAccountNumber(ad);
        System.out.print("Balance: ");
        double bal = scan.nextDouble();
        b1.setBalance(bal);
        scan.nextLine();
        System.out.println();

        System.out.println("#2 BankAccount2");
        System.out.print("NAMR: ");
        name = scan.nextLine();
        b2.setCustomerName(name);
        System.out.print("ADDR: ");
        ad = scan.nextLine();
        b2.setAccountNumber(ad);
        System.out.print("Balance: ");
        bal = scan.nextDouble();
        b2.setBalance(bal);
        scan.nextLine();
        System.out.println();

        System.out.println("#3 CheckingAccount1");
        System.out.print("NAMR: ");
        name = scan.nextLine();
        c1.setCustomerName(name);
        System.out.print("ADDR: ");
        ad = scan.nextLine();
        c1.setAccountNumber(ad);
        System.out.print("Balance: ");
        bal = scan.nextDouble();
        c1.setBalance(bal);
        System.out.print("FEE: ");
        double fee = scan.nextDouble();
        c1.setOverdraftFee(fee);
        scan.nextLine();
        System.out.println();

        System.out.println("#4 CheckingAccount2");
        System.out.print("NAMR: ");
        name = scan.nextLine();
        c2.setCustomerName(name);
        System.out.print("ADDR: ");
        ad = scan.nextLine();
        c2.setAccountNumber(ad);
        System.out.print("Balance: ");
        bal = scan.nextDouble();
        c2.setBalance(bal);
        System.out.print("FEE: ");
        fee = scan.nextDouble();
        c2.setOverdraftFee(fee);
        scan.nextLine();
        System.out.println();

        System.out.println("Choose Account: " + c2.getAccountNumber());
        System.out.print("Choose Action (1. Withdraw 2. Deposit) : ");
        int action = scan.nextInt();
        if (action == 1) {
            System.out.print("Value: ");
            double value = scan.nextDouble();
            c2.withdraw(value);
        } else if (action == 2) {
            System.out.print("Value: ");
            double value = scan.nextDouble();
            c2.deposit(value);
        }

        System.out.println("Choose Account: " + b1.getAccountNumber());
        System.out.print("Choose Action (1. Withdraw 2. Deposit) : ");
        action = scan.nextInt();
        if (action == 1) {
            System.out.print("Value: ");
            double value = scan.nextDouble();
            b1.withdraw(value);
        } else if (action == 2) {
            System.out.print("Value: ");
            double value = scan.nextDouble();
            b1.deposit(value);
        }
        System.out.println("Choose Account: " + c2.getAccountNumber());
        System.out.print("Choose Action (1. Withdraw 2. Deposit) : ");
        action = scan.nextInt();
        if (action == 1) {
            System.out.print("Value: ");
            double value = scan.nextDouble();
            c2.withdraw(value);
        } else if (action == 2) {
            System.out.print("Value: ");
            double value = scan.nextDouble();
            c2.deposit(value);
        }

    }
}