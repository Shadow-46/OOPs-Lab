class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 500);
        System.out.println("Account Number: " + account.getAccountNumber());
        account.deposit(200);
        account.withdraw(100);
    }
}
