package Week07Theory.Interprator;

public class AddExpression implements Expression {
    Expression left;
    Expression right;
    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;

    }
    @Override
    public int interperate(String context) {
        return left.interperate(context) + right.interperate(context);
    }
}
