class Laptop {
    String brand;
    int ram;
    double price;

    Laptop() {
        this.brand = "Unknown";
        this.ram = 4;
        this.price = 500.0;
        System.out.println("Default Laptop: " + brand + " | RAM: " + ram + "GB | Price: $" + price);
    }

    Laptop(String brand) {
        this.brand = brand;
        this.ram = 8;
        this.price = 700.0;
        System.out.println("Laptop: " + brand + " | RAM: " + ram + "GB | Price: $" + price);
    }

    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
        System.out.println("Laptop: " + brand + " | RAM: " + ram + "GB | Price: $" + price);
    }
}

public class ConstructorOverloading2 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Dell");
        Laptop l3 = new Laptop("MacBook", 16, 1500.99);
    }
}
