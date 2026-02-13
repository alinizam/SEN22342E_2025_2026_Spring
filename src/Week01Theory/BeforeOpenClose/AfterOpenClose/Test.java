package Week01Theory.BeforeOpenClose.AfterOpenClose;

import Week01Theory.BeforeOpenClose.AreaCalculator;
import Week01Theory.BeforeOpenClose.Circle;
import Week01Theory.BeforeOpenClose.Rectangle;
import Week01Theory.BeforeOpenClose.Shape;

public class Test {
    public static void main() {
        AreaCalculator a=new AreaCalculator();
        double result=a.Area(new Shape[]{new Circle(1),new Rectangle(1,5)});
        System.out.println(result);
    }
}
