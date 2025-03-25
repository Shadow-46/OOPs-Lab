import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        double principal;
        double rate;
        double time;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the principal: ");
            principal = sc.nextDouble();
            System.out.print("Enter the rate of interest: ");
            rate = sc.nextDouble();
            System.out.print("Enter the time period: ");
            time = sc.nextDouble();
        }
        double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;
        System.out.println("Compound Interest = " + compoundInterest);
    }
}
