class Car{
    public Car()
    {
     System.out.println("Class Car");
    }
    public void vehicleType()
    {
     System.out.println("Vehicle Type: Car");
    }
 }
 class Buggati extends Car{
    public void displayBuggati()
    {
     System.out.println("Class Buggati");
    }
    public void brand()
    {
     System.out.println("Brand: Buggati");
    }
    public void speed()
    {
     System.out.println("Max: 400Kmph");
    }
 }
 public class Multilevel1 extends Buggati{
 
    public void model()
    {
     System.out.println("Model: Chiron");
    }
    public static void main(String args[])
    {
      Multilevel1 obj=new Multilevel1();
      obj.vehicleType();
      obj.brand();
      obj.model();
      obj.speed();
    }
 }