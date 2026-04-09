package Week09Lab.Example02Interprator;

public class ANDExpression implements Expression {
    @Override
    public boolean interpret() {
        return left.interpret() && right.interpret();
    }

    Expression left, right;
    public ANDExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
