package Week06Lab.Question1FlyWeigtComposite;

public class Client {
    public static void main(String[] args) {
        Shape s1=new Circle("GREEN");
        Shape s2=new Circle("RED");
        Shape s3=new Circle("GREEN");
        Shape sComposite=new ShapeGroup("RED");
        ((ShapeGroup)sComposite).shapeCollection.add(s1);
        ((ShapeGroup)sComposite).shapeCollection.add(s2);
        ((ShapeGroup)sComposite).shapeCollection.add(s3);
        ((ShapeGroup)sComposite).displayShapeColors();
    }
}
