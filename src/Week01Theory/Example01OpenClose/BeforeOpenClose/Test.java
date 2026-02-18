package Week01Theory.Example01OpenClose.BeforeOpenClose;

public class Test {
    public static void main() {
        AreaCalculator a=new AreaCalculator();
        double result=a.Area(new Shape[]{new Circle(1),new Rectangle(1,5)});
        System.out.println(result);
    }
}
