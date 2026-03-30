package Week07Theory.Interprator;

public class ClientWithoutExternalGrammer {
    static void main() {
        Expression add=new AddExpression(new RigthNumberExpression(), new LeftNumberExpression());
        System.out.println(add.interperate("1+6"));
    }
}
