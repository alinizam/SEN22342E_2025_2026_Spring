package Week09Theory.Observer;

public class Observer implements IObserver {

    @Override
    public void update() {
        System.out.println("Observer update");
    }
}
