package Week09Lab.Example02Interprator;

public class VariableExpression implements Expression {

    Context c;

    VariableExpression(Context c){
        this.c=c;
    }
    public boolean interpret( ) {
        return c.status;
    }
}
