package Week01Theory.Example01OpenClose.AfterOpenClose;

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
