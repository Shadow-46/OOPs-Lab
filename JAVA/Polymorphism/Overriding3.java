class Food {
    void prepare() {
        System.out.println("Preparing a general food item.");
    }
}

class Pizza extends Food {
    @Override
    void prepare() {
        System.out.println("Preparing a Pizza with toppings.");
    }
}

class Burger extends Food {
    @Override
    void prepare() {
        System.out.println("Preparing a Burger with cheese and veggies.");
    }
}

public class Overriding3 {
    public static void main(String[] args) {
        Food food1 = new Pizza();
        food1.prepare();

        Food food2 = new Burger();
        food2.prepare();
    }
}
