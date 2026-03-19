package Week06Lab.Question1FlyWeigtComposite;


import java.util.ArrayList;

public class ShapeGroup implements Shape{
    Color color;
    ShapeGroup(String color) {
        this.color=ColorFactory.getColor(color);
    }
    ArrayList<Shape> shapeCollection=new ArrayList<>();
    void displayShapeColors(){
        System.out.println(this.getColor());
        for(Shape s:shapeCollection){
            System.out.println(s.getColor());
        }
    }
    @Override
    public Color getColor() {
        return color;
    }
}
