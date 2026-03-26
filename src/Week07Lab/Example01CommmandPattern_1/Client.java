package Week07Lab.Example01CommmandPattern_1;

public class Client {
    public static void main(String[] args) {
        Waiter w=new Waiter();
        w.addOrder(new MealCookCommand(new Soup()));
        w.addOrder(new MealCookCommand(new Soup()));
        w.addOrder(new MealCookCommand(new Soup()));
        w.addOrder(new MealCookCommand(new Kebab()));
        w.deliverOrder();
    }
}
