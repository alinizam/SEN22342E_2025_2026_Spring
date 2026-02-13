package Week01Theory.BeforeOpenClose.AfterOpenClose;

import Week01Theory.BeforeOpenClose.Shape;

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
