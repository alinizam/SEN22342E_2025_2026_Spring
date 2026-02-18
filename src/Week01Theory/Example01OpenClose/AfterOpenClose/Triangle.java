package Week01Theory.Example01OpenClose.AfterOpenClose;

public class Triangle implements IShape {
    double a,h;

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double getArea() {
        return a*h/2;
    }
}
