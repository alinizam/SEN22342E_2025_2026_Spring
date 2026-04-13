package Week09Lab.Example02Interprator;

public class Client {
    static void main() {
        //unstandard way of passing context to interprator
        Context A = new Context(true);
        Context B = new Context(true);
        Expression e=new ANDExpression(new VariableExpression(A),new VariableExpression(B));
        System.out.println(e.interpret());
    }
}
