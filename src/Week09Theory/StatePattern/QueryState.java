package Week09Theory.StatePattern;

public class QueryState implements State {

    @Override
    public void doCommit(DBRecord record) {
        System.out.println("Not edffected");
    }

    @Override
    public void doModify(DBRecord record) {
        record.setState(new ModifyState());
    }
}
