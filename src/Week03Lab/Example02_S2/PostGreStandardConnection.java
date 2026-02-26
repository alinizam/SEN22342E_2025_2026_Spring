package Week03Lab.Example02_S2;

public class PostGreStandardConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Standard PostGre database...");
    }
}
