package Week09Theory.StatePattern;

public class ModifyState implements State {
    @Override
    public void doCommit(DBRecord record) {
        record.setState(new QueryState());
    }

    @Override
    public void doModify(DBRecord record) {
        System.out.println("Already modified.");
    }
}
