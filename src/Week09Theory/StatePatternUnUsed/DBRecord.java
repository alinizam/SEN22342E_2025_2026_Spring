package Week09Theory.StatePatternUnUsed;

public class DBRecord {
    String state;
    DBRecord(String state) {
        this.state="NEW";
    }

    public void setState(String action) {
        if (this.state.equals("NEW") && action.equals("MODIFY")){
            this.state="INSERT";
        }else if (this.state.equals("MODIFY") && action.equals("DELETE")){
            this.state="NEW";
        }

    }
}
