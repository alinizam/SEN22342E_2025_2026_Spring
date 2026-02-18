package Week01Theory.Example01OpenClose.AfterOpenClose;

import Week01Theory.Example01OpenClose.BeforeOpenClose.AreaCalculator;
import Week01Theory.Example01OpenClose.BeforeOpenClose.Circle;
import Week01Theory.Example01OpenClose.BeforeOpenClose.Rectangle;
import Week01Theory.Example01OpenClose.BeforeOpenClose.Shape;

public class Test {
    public static void main() {
        AreaCalculator a=new AreaCalculator();
        double result=a.Area(new Shape[]{new Circle(1),new Rectangle(1,5)});
        System.out.println(result);
    }
}
