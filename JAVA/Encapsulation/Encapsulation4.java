class Car {
    private final String model;
    private int speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int increase) {
        if (increase > 0) {
            speed += increase;
            System.out.println(model + " accelerated to " + speed + " km/h.");
        } else {
            System.out.println("Invalid acceleration value.");
        }
    }

    public void brake(int decrease) {
        if (decrease > 0 && decrease <= speed) {
            speed -= decrease;
            System.out.println(model + " slowed down to " + speed + " km/h.");
        } else {
            System.out.println("Invalid braking value.");
        }
    }
}

public class Encapsulation4 {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S");
        car.accelerate(50);
        car.brake(20);
    }
}
