package Week02Theory.Singleton.Eager;

public class AnotherClient {
    void useConnection(){

        System.out.println(Connection.getInstance());
    }
}
