interface Walkable {
    void walk();
}

interface Talkable {
    void talk();
}

class Robot implements Walkable, Talkable {
    @Override
    public void walk() {
        System.out.println("Robot is walking...");
    }

    @Override
    public void talk() {
        System.out.println("Robot is talking...");
    }
}

public class Multiple1 {
    public static void main(String[] args) {
        Robot robo = new Robot();
        robo.walk();
        robo.talk();
    }
}

