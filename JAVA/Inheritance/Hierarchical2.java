class Account {
    void showBalance() {
        System.out.println("Showing account balance.");
    }
}
class SavingsAccount extends Account {
    void addInterest() {
        System.out.println("Interest added to savings account.");
    }
}
class CurrentAccount extends Account {
    void processOverdraft() {
        System.out.println("Overdraft processed for current account.");
    }
}
public class Hierarchical2 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.showBalance();
        savings.addInterest();
        CurrentAccount current = new CurrentAccount();
        current.showBalance();
        current.processOverdraft();
    }
}
