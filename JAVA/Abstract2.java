abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println(name + " has a fixed monthly salary.");
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println(name + " is paid based on hours worked.");
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("John");
        e1.calculateSalary();

        Employee e2 = new PartTimeEmployee("Alice");
        e2.calculateSalary();
    }
}
