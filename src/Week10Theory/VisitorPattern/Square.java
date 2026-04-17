package Week10Theory.VisitorPattern;

public class Square implements ShapeVisitable {
    @Override
    public int accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }
    int x;
    Square(int x) {
        this.x = x;
    }
    public int getArea(){
        return x*x;
    }

    @Override
    public int getPerimeter() {
        return 4*x;
    }
}
