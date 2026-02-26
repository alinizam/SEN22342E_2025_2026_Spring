package Week03Lab.Example01;

public class ConnectionFactory {
    Connection createConnection(ConnectionType connectionType) {
        switch (connectionType) {
           case MySQL:
                return new MySQLConnection();
           case PostgreSQL:
               return new PostGreConnection();
           default:
              System.out.println("Invalid connection type");
              return null;
        }
    }
}
