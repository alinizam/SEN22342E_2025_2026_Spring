package Week03Lab.Example02_S2;

public class PostGreConnectionFactory implements AbstractDatabaseFactory {
    @Override
    public Connection createConnection(ConnectionType connectionType) {
        switch (connectionType) {
            case PostgreSQLStandard:
                return new PostGreStandardConnection();
            case PostgreSQLPooled:
                return new PostGrePooledConnection();
            default:
                System.out.println("Unknown connection type");
                return null;
        }
    }


}
