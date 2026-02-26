package Week03Lab.Example02_S2;


public class MySQLConnectionFactory implements AbstractDatabaseFactory {
    @Override
    public Connection createConnection(ConnectionType connectionType) {
        switch (connectionType) {
            case MySQLStandard:
                return new MySQLStandardConnection();
            case MySQLPooled:
                return new MySQLPooledConnection();
            default:
                System.out.println("Unknown connection type");
                return null;
        }
    }
}
