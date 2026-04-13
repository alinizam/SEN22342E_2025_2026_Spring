package Week09Theory.Memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
    Memento createMemento() {
        return new Memento(state);
    }
    String getStateFromMemento(Memento memento) {
        return memento.getState();
    }

}
