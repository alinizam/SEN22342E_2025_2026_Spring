package Week03Lab.Example01;

public class MySQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}
