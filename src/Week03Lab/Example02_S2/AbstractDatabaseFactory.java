package Week03Lab.Example02_S2;



public interface AbstractDatabaseFactory {
        Connection createConnection(ConnectionType connectionType);
}

