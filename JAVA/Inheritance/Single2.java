class Vehicle {
    protected String brand = "Ford";
    public void Exhaust() {
      System.out.println("Vroom Vroom!!");
    }
  }
  class Single2 extends Vehicle {
    private final String modelName = "Mustang";
    public static void main(String[] args) {
      Single2 myFastCar = new Single2();
      myFastCar.Exhaust();
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
  }
