import UserDefinedFiles.BankAccount;

public class main2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sanjay", 5000);

        System.out.println("Initial Account Details:");
        account.displayBalance();

        account.deposit(1000);
        account.withdraw(2000);
        account.displayBalance();
    }
}
