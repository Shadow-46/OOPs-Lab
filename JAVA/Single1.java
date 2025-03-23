class Student{
    void Fee() {
        System.out.println("Student Fee= 3,25,000");
    }
}
class Student_Name extends Student{ 
    void Name() {
        System.out.println("Student Name=Sanjay");
    }
}
class Single1 {
    public static void main(String args[]) {
        Single1 p = new Single1();
        p.Fee(); 
        p.Name(); 
    }
}
