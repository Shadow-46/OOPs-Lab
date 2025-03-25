interface Messenger {
    void sendMessage();
}

class WhatsApp implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Sending message via WhatsApp.");
    }
}

class Telegram implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Sending message via Telegram.");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Messenger m1 = new WhatsApp();
        m1.sendMessage();

        Messenger m2 = new Telegram();
        m2.sendMessage();
    }
}
