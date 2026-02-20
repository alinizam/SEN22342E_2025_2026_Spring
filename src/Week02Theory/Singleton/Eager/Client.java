package Week02Theory.Singleton.Eager;

import java.net.ConnectException;

public class Client {
    static void main() {
        Connection c;
        System.out.println(Connection.getInstance());
        System.out.println(Connection.getInstance());

        System.out.println(Connection.getInstance());
        useConnection();
        AnotherClient anotherClient = new AnotherClient();
        anotherClient.useConnection();
    }
    static void useConnection(){
        Connection.getInstance();
        System.out.println(Connection.getInstance());
    }
}
