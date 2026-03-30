package Week07Theory.Interprator_1.Interprator;

import Week07Theory.Interprator.LeftNumberExpression;

public class ClientWithExternalGrammer {
    static void main() {
        String context="1+2";
        Expression add=null;
        if (context.contains("+")){
            Expression l=new NumberExpression(context.substring(0,context.indexOf("+")));
            Expression r=new NumberExpression(context.substring(context.indexOf("+")+1));
            add=new AddExpression(l,r);
            System.out.println(add.interperate());
        }


    }
}
