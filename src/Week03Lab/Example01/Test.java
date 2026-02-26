package Week03Lab.Example01;

public class Test {
    public static void main(String[] args) {
        Connection connection = null;
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connection=connectionFactory.createConnection(ConnectionType.MySQL);
        connection.connect();
        connection=connectionFactory.createConnection(ConnectionType.PostgreSQL);
        connection.connect();
    }

}
