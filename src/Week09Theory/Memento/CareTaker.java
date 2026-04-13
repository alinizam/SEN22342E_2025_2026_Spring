package Week09Theory.Memento;

import java.util.ArrayList;

public class CareTaker {
    ArrayList<Memento> states=new ArrayList<>();
    void storeState(Originator originator){
        states.add(originator.createMemento());
    }
    //Pattern standard
    void storeState(Memento m){
        states.add(m);
    }
    Memento getPreviousState(){
        Memento memento=states.get(states.size()-1);
        states.remove(states.size()-1);
        return memento;
    }
    Memento getSpecialPreviousState(int i){
        return states.get(i);
    }
}
