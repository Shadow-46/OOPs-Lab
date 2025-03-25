import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/):");
        char operation = sc.next().charAt(0);
        double op = 0;
        switch (operation) {
        case '+':
            op = n1 + n2;
            break;
        case '-':
            op = n1 - n2;
            break;
        case '*':
            op = n1 * n2;
            break;
        case '/':
            op = n1 / n2;
            break;
        default:
            System.out.println("Please enter a proper input");
            break;
        }
        System.out.println("The Result: ");
        System.out.println();
        System.out.println(op);
    }
}