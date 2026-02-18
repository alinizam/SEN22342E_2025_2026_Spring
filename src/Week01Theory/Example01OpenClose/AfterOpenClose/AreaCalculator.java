package Week01Theory.Example01OpenClose.AfterOpenClose;

public class AreaCalculator {
    public double Area(IShape[] shapes) {
        double area = 0;
        for(IShape shape:shapes){
           area+= shape.getArea();
        }
        return area;
    }
}
