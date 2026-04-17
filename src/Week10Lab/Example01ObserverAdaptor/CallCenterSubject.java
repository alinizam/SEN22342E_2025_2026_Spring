package Week10Lab.Example01ObserverAdaptor;

import java.util.ArrayList;

public class CallCenterSubject {
    ArrayList<DepartmentObserver> observers=new ArrayList<>();
    void addComplaint(){
        System.out.println("A complaint comes");
        notifyObservers();
    }
    public void addObserver(DepartmentObserver observer){
        observers.add(observer);
    }
    public void removeObserver(DepartmentObserver observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for(DepartmentObserver observer:observers){
            observer.update();
        }
    }
}
