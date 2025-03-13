import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time period: ");
        double time = sc.nextDouble();
        sc.close();
        double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;
        System.out.println("Compound Interest = " + compoundInterest);
    }
}
