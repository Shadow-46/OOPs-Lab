class Student {
    private final String name;
    private final int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student: " + name + " | Age: " + age + " | Grade: " + grade);
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Student student = new Student("Alice", 16, "10th");
        student.displayInfo();
        student.setGrade("11th");
        student.displayInfo();
    }
}
