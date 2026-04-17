package Week10Theory.VisitorPattern;

public class AreaCalculateVisitor implements ShapeVisitor {

    @Override
    public int visit(ShapeVisitable shape) {
        return shape.getArea();
    }
}
