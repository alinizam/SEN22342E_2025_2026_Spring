package Week03Lab.Example02_S1;

public class PostGreFactory implements AbstractDatabaseFactory {
    @Override
    public Connection createStandardConnection() {
       return new PostGreStandardConnection();
    }

    @Override
    public Connection createPooledConnection() {
        return new PostGrePooledConnection();
    }

}
