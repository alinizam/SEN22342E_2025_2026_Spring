package Week07Theory.Interprator;

public class LeftNumberExpression implements Expression {

    @Override
    public int interperate(String context) {
        System.out.println(context.substring(context.indexOf("+")+1));
        return Integer.parseInt(context.substring(context.indexOf("+")+1));
    }
}
