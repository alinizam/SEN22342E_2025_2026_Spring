package Week09Theory.StatePattern;

public interface State {
    void doCommit(DBRecord record);
    void doModify(DBRecord record);

}
