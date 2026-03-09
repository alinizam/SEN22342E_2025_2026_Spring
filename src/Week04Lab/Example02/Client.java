package Week04Lab.Example02;

public class Client {
    static void main() {
        Vehicle c=new Car.builder().setGPS("YES").setSunRoof(true).build();
        System.out.println(c.GPS);
    }
}
