package Week07Theory.Interprator_1.Interprator;

public class AddExpression implements Expression {
    Expression left;
    Expression right;
    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;

    }
    @Override
    public int interperate() {
        return left.interperate() + right.interperate();
    }
}
