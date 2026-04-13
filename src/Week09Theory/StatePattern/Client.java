package Week09Theory.StatePattern;

public class Client {
    static void main() {
        DBRecord record = new DBRecord();
        record.sayState();
        record.doCommit();
        record.sayState();
        record.doModify();
        record.sayState();
        record.doCommit();
        record.sayState();
        record.doCommit();
        record.sayState();
        record.doModify();
        record.sayState();
    }
}
