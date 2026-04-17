package Week10Theory.VisitorPattern;

public interface ShapeVisitable {
    int accept(ShapeVisitor visitor);
    int getArea();
    int getPerimeter();
}
