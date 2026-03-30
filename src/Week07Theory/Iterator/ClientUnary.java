package Week07Theory.Iterator;

public class ClientUnary {
    static void main() {
        int i=1;
        int x=(i++)+2*(++i);
        System.out.println(x);
        System.out.println(i);
    }
}
