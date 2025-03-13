import java.util.Scanner;
public class OddorEven{
  public static void main(String[] args){
    int x;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter number: ");
    x = obj.nextInt();
    obj.close();
    if (x % 2 == 0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}