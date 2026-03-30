package Week07Theory.Interprator;

public class RigthNumberExpression implements Expression {

    @Override
    public int interperate(String context) {
        System.out.println(context.substring(0,context.indexOf("+")));
        return Integer.parseInt(context.substring(0,context.indexOf("+")));
    }
}
