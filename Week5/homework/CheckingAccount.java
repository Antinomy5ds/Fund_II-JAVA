package Homework;

public class CheckingAccount extends BankAccount {
    private double overdraftFee;

    public CheckingAccount(String customerName, String accountNumber, double balance, double overdraftFee) {
        super(customerName, accountNumber, balance);
    }

    public double getOverdraftFee() {
        return this.overdraftFee;
    }

    public void setOverdraftFee(double fee) {
        this.overdraftFee = fee;
    }

    public void withdraw(double amount) {
        double total = getOverdraftFee() + amount;
        if (total > getBalance()) {
            System.out.println("Withdraw Failed!!");
            System.out.println("#######\n");
        } else {
            System.out.println("Withdraw Complete!!");
            System.out.printf("%s %s Deposit %f Fee %f Balance %f \n", getAccountNumber(), getCustomerName(), amount,
                    getOverdraftFee(), getBalance() - total);
            setBalance(getBalance() - total);
            System.out.println("#######\n");
        }
    }

}
