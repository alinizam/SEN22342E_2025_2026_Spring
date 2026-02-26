package Week03Lab.Example02_S1;

interface AbstractDatabaseFactory {
    Connection createStandardConnection();
    Connection createPooledConnection();
}

