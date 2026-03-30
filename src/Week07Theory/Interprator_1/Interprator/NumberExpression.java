package Week07Theory.Interprator_1.Interprator;

public class NumberExpression implements Expression {
    String context;
    NumberExpression(String context) {
        this.context = context;
    }
    @Override
    public int interperate() {
       return Integer.parseInt(context);
    }
}
