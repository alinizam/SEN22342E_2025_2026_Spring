package Week09Theory.Strategy;

public class Client {
    public static void main(String[] args) {
        Context c=new Context(10,3);

        System.out.println( c.calculate(new AddAlgorithm()));

        System.out.println(c.calculate((a,b)->(a-b)));
        System.out.println(c.calculate((a,b)->(a*b)));
    }
}
