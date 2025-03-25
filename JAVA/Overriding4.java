class SmartDevice {
    void turnOn() {
        System.out.println("Turning on the device...");
    }
}

class SmartLight extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("Smart Light is now ON.");
    }
}

class SmartFan extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("Smart Fan is now ON.");
    }
}

public class Overriding4 {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        light.turnOn();

        SmartDevice fan = new SmartFan();
        fan.turnOn();
    }
}
