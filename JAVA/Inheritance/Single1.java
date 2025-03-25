class Student{
    void Fee() {
        System.out.println("Student Fee = 3,25,000");
    }
}
class Student_Name extends Student{ 
    void Name() {
        System.out.println("Student Name = Sanjay");
    }
}
class Single1 {
    public void execute() {
        Student_Name p = new Student_Name();
        p.Fee(); 
        p.Name(); 
    }

    public static void main(String args[]) {
        Single1 instance = new Single1();
        instance.execute();
    }
}
