interface Camera {
    void takePhoto();
}

interface GPS {
    void showLocation();
}

class Smartphone implements Camera, GPS {
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void showLocation() {
        System.out.println("Showing GPS location...");
    }
}

public class Multiple2 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.showLocation();
    }
}

