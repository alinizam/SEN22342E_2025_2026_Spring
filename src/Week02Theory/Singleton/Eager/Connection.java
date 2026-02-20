package Week02Theory.Singleton.Eager;

public class Connection {
    private final static Connection instance;
    int count;
    private Connection(){

    }
    static{
        instance=new Connection();
        System.out.println("A Connection is Created");
    }

    public static Connection getInstance() {
        return instance;
    }
}
