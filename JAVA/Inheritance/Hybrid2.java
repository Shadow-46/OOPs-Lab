class MyVehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends MyVehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

interface Electric {
    void charge();
}

class Tesla extends Car implements Electric {
    @Override
    public void charge() {
        System.out.println("Tesla is charging...");
    }
}

public class Hybrid2 {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.start();
        myTesla.drive();
        myTesla.charge();
    }
}