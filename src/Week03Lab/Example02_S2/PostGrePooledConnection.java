package Week03Lab.Example02_S2;

public class PostGrePooledConnection  implements Connection {
    @Override
    public void connect() {
           System.out.println("Connecting to Pooled PostGre database...");
    }
}
