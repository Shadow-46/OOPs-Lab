import java.util.Scanner;
class Overloading1 {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading1 calculator = new Overloading1();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum of two numbers: " + calculator.add(a, b));
            System.out.println("Enter three numbers: ");
            int c = sc.nextInt();
            System.out.println("Sum of three numbers: " + calculator.add(a, b, c));
            System.out.println("Enter two decimal numbers: ");
            double d = sc.nextDouble();
            double e = sc.nextDouble();
            System.out.println("Sum of two decimal numbers: " + calculator.add(d, e));
        }
    }
}