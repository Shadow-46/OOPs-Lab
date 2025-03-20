class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Woof!");
    }
}
class Puppy extends Dog {
    public void play() {
        System.out.println("Puppy is playing");
    }
}
public class Multilevel2 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.makeSound();
        puppy.bark();
        puppy.play();
    }
}