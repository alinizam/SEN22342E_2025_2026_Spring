package Week07Lab.Example01CommmandPattern;

public class Client {
    public static void main(String[] args) {
        Waiter w=new Waiter();
        w.addOrder(new SoupCookCommand(new Soup()));
        w.addOrder(new SoupCookCommand(new Soup()));
        w.addOrder(new SoupCookCommand(new Soup()));
        w.addOrder(new KebabCookCommand(new Kebab()));
        w.deliverOrder();
    }
}
