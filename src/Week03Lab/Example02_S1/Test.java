package Week03Lab.Example02_S1;

public class Test {
    public static void main(String[] args) {
         AbstractDatabaseFactory  factory = new MySQLFactory();
         Connection connection = factory.createStandardConnection();
         connection.connect();
         connection = factory.createPooledConnection();
         connection.connect();
         factory = new PostGreFactory();
         connection = factory.createStandardConnection();
         connection.connect();
    }

}
