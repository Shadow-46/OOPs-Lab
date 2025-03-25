interface Storage {
    void storeData();
}

class CloudStorage implements Storage {
    @Override
    public void storeData() {
        System.out.println("Storing data in Cloud.");
    }
}

class LocalStorage implements Storage {
    @Override
    public void storeData() {
        System.out.println("Storing data in Local Storage.");
    }
}

public class Interface4 {
    public static void main(String[] args) {
        Storage s1 = new CloudStorage();
        s1.storeData();

        Storage s2 = new LocalStorage();
        s2.storeData();
    }
}
