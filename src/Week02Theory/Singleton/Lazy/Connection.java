package Week02Theory.Singleton.Lazy;

public class Connection {
    private static Connection instance;
    int count;
    private Connection(){

    }
    public static Connection getInstance() {
        if(instance == null){
            instance=new Connection();
            System.out.println("Connection created");
        }
        return instance;
    }
}
