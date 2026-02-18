package Week01Theory.Example01OpenClose.AfterOpenClose;

public class Rectangle implements IShape {
    int width,heigth;

    public Rectangle(int width,int heigth) {
        this.width = width;
        this.heigth=heigth;
    }

    @Override
    public double getArea() {
        return width*heigth;
    }
}
