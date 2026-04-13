package Week09Theory.Memento;

public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();
        originator.setState("State1");
        careTaker.storeState(originator);
        originator.setState("State2");
        careTaker.storeState(originator);
        System.out.println(careTaker.getPreviousState().getState());
        System.out.println(careTaker.getPreviousState().getState());
    }
}
