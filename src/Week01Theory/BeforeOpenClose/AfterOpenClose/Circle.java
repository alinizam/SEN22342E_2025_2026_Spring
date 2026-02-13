package Week01Theory.BeforeOpenClose.AfterOpenClose;

import Week01Theory.BeforeOpenClose.Shape;

public class Circle implements IShape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r*r*Math.PI;
    }
}
