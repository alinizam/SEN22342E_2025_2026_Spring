package Week01Theory.BeforeOpenClose.AfterOpenClose;

import Week01Theory.BeforeOpenClose.Shape;

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
