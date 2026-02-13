package Week01Theory.BeforeOpenClose.AfterOpenClose;

import Week01Theory.BeforeOpenClose.Circle;
import Week01Theory.BeforeOpenClose.Rectangle;
import Week01Theory.BeforeOpenClose.Shape;
import Week01Theory.BeforeOpenClose.Triangle;

public class AreaCalculator {
    public double Area(IShape[] shapes) {
        double area = 0;
        for(IShape shape:shapes){
           area+= shape.getArea();
        }
        return area;
    }
}
