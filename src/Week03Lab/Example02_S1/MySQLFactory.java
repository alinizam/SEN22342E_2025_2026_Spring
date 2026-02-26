package Week03Lab.Example02_S1;

public class MySQLFactory implements AbstractDatabaseFactory {
    @Override
    public Connection createStandardConnection() {
        return new MySQLStandardConnection();
    }

    @Override
    public Connection createPooledConnection() {
        return new  MySQLPooledConnection();
    }
}
