package Week09Theory.StatePattern;

public class DBRecord {
    State state;
    DBRecord(){
        state=new NewState();
    }

    public void setState(State state) {
        this.state = state;
    }

    void doCommit(){
        state.doCommit(this);
    }
    void doModify() {
        state.doModify(this);
    }
    void sayState(){
        System.out.println(state);
    }

}
