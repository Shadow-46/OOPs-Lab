class Person {
    void showDetails() {
        System.out.println("This is a person.");
    }
}
class Employee extends Person {
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
interface RemoteWork {
    void workFromHome();
}
class RemoteDeveloper extends Developer implements RemoteWork {
    @Override
    public void workFromHome() {
        System.out.println("Remote Developer is working from home.");
    }
}
public class Hybrid1 {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.showDetails();
        mgr.work();
        mgr.manageTeam();
        RemoteDeveloper dev = new RemoteDeveloper();
        dev.showDetails();
        dev.work();
        dev.code();
        dev.workFromHome();
    }
}
