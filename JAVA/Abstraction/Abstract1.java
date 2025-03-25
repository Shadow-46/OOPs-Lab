abstract class Vehicle {
    abstract void start();
    
    void fuelCapacity() {
        System.out.println("Fuel capacity varies by vehicle type.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or push button.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start or kick.");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.fuelCapacity();

        Vehicle bike = new Bike();
        bike.start();
        bike.fuelCapacity();
    }
}
