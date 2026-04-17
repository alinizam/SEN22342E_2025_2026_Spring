package Week10Theory.VisitorPattern;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<ShapeVisitable> shapes = new ArrayList<>();
        shapes.add(new Square(10));
        shapes.add(new Square(20));
        shapes.add(new Triange(10,20,30,40));
        int total = 0;
        for (ShapeVisitable shape : shapes) {
            total+=shape.accept(new AreaCalculateVisitor());

        }
        System.out.println(total);
    }
}
