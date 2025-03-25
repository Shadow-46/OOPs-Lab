interface Database {
    void connect();
}

class MySQL implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database...");
    }
}

class PostgreSQL implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL Database...");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Database db1 = new MySQL();
        db1.connect();

        Database db2 = new PostgreSQL();
        db2.connect();
    }
}
