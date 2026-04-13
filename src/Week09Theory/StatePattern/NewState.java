package Week09Theory.StatePattern;

public class NewState implements State {
    public void doCommit(DBRecord record) {
        System.out.println("Commit doesn effect new state");
    }
    public void doModify(DBRecord record) {
        record.setState(new ModifyState());
    }
}
