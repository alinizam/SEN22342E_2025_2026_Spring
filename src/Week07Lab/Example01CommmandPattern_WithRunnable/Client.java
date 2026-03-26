package Week07Lab.Example01CommmandPattern_WithRunnable;

public class Client {
    public static void main(String[] args) {
        Waiter w=new Waiter();
        w.addOrder(new Soup()::cook);
        w.addOrder(new Soup()::cook);
        w.addOrder(new Soup()::cook);
        w.addOrder(new Kebab()::cook);
        w.deliverOrder();
    }
}
