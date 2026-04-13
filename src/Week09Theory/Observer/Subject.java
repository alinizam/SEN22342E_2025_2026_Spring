package Week09Theory.Observer;

import java.util.ArrayList;

public class Subject implements ISubject {
    private ArrayList<IObserver> observers=new ArrayList<>();
    @Override
    public void addObserver(IObserver o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update();
        }
    }

}
