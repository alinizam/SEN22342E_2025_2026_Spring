package Week03Lab.Example02_S1;

public class MySQLStandardConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Standard MySQL database...");
    }
}
