import UserDefinedFiles.Student;

public class main1 {
    public static void main(String[] args) {
        Student s1 = new Student("Sanjay", 101, 89.5);
        Student s2 = new Student("Advaith", 102, 76.3);

        System.out.println("Student Details:");
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}
