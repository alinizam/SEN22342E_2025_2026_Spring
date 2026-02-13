package Week01Theory.BeforeOpenClose;

public class AreaCalculator {
    public double Area(Shape[] shapes) {
        double area = 0;
        for(Shape shape:shapes)
        {
            if (shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            area += rectangle.width * rectangle.heigth;
        }
        else if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            area += circle.r * circle.r * Math.PI;
        }else if(shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                area += triangle.a * triangle.h / 2;
        }
        }
        return area;
    }
}
