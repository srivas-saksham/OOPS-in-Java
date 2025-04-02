/* Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. 
The bank should have a list of accounts and methods for adding them. 
Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. 
SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
*/

import java.util.*;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    private String accountNumber;
    private double balance;
    private double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Account Balance: $" + balance);
    }
}

class CurrentAccount implements Account {
    private String accountNumber;
    private double balance;
    private double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for current account.");
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000, 5);
        CurrentAccount current = new CurrentAccount("CA456", 2000, 500);

        savings.deposit(500);
        savings.calculateInterest();
        savings.withdraw(300);
        savings.viewBalance();

        System.out.println("-----------------------------");

        current.deposit(1000);
        current.withdraw(2800);
        current.viewBalance();
    }
}
