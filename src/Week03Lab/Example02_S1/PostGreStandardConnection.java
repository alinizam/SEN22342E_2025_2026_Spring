package Week03Lab.Example02_S1;

public class PostGreStandardConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Standard PostGre database...");
    }
}
