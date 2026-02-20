package Week02Theory.Singleton.Lazy;

public class Client {
    public static void main(String[] args) {
        Connection c=Connection.getInstance();
        Connection c1=Connection.getInstance();
        Connection c2=Connection.getInstance();
        System.out.println(c==c1);
        System.out.println(c1==c2);
    }
}
