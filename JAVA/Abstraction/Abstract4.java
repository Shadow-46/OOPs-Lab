abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Abstract4 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();

        Shape s2 = new Rectangle();
        s2.draw();
    }
}
