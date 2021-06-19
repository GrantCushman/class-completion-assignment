package project;

public class SavingsAccount {
    private double balance;
    private int accountNum;
    private double intRate;

    public SavingsAccount(double balance, int accountNum, double intRate) {
        this.balance = balance;
        this.accountNum = accountNum;
        this.intRate = intRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNum;
    }

    public double getInterestRate() {
        return intRate;
    }

    public void deposit(double depositAmt) {
        balance = balance + depositAmt;
    }

    public void withdraw(double withdrawalAmt) {
        if (withdrawalAmt <= balance) {
            balance = balance - withdrawalAmt;
        }
    }

    public void accrueInterest() {
        balance = balance + balance * intRate;
    }
}


