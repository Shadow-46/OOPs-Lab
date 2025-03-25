class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}
class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager is managing the team.");
    }
}
class Developer extends Employee {
    void code() {
        System.out.println("Developer is writing code.");
    }
}
public class Hierarchical1 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.work();
        manager.manageTeam();

        Developer developer = new Developer();
        developer.work();
        developer.code();
    }
}
