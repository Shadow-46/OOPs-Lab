class Notification {
    void sendNotification() {
        System.out.println("Sending a general notification...");
    }
}
class EmailNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Sending an Email notification...");
    }
}
class SMSNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Sending an SMS notification...");
    }
}
public class Overriding2 {
    public static void main(String[] args) {
        Notification notify1 = new EmailNotification();
        notify1.sendNotification();
        Notification notify2 = new SMSNotification();
        notify2.sendNotification();
    }
}
