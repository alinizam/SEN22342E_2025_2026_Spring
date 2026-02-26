package Week03Lab.Example02_S2;

public class Test {
    static void main() {
        AbstractDatabaseFactory factory = new MySQLConnectionFactory();
        Connection connection=factory.createConnection(ConnectionType.MySQLPooled);
        connection.connect();
        connection= factory.createConnection(ConnectionType.MySQLStandard);
        connection.connect();

    }
}
