package CIET;

public class Oopbanking {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    // Constructor
    Oopbanking(String accountHolder, long accountNumber, double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    // Deposit
    void deposit(double amount) {

        if (amount > 0) {

            balance = balance + amount;

            System.out.println("Deposit successful");

        } else {

            System.out.println("Invalid deposit");

        }

    }

    // Withdraw
    void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawal successful");

        } else {

            System.out.println("Insufficient balance");

        }

    }

    // Display balance
    void displayBalance() {

        System.out.println("\n----- Account Holder Details -----");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);

    }

    public static void main(String[] args) {

        Oopbanking account =
                new Oopbanking("Charry", 589621796431188L, 5000);

        account.displayBalance();

        account.deposit(2000);

        account.displayBalance();

        account.withdraw(1500);

        account.displayBalance();

        account.withdraw(10000);

    }

}