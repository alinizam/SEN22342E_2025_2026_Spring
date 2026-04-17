package Week10Theory.VisitorPattern;

public class Triange implements ShapeVisitable {
    @Override
    public int accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }
    int a,b,c,h;
    Triange(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;

    }
    @Override
    public int getArea() {
        return (a*h)/2;
    }
    @Override
    public int getPerimeter() {
        return a+b+c;
    }
}
