package Week05Theory.FlyWeight;

public class Client {
    public static void main(String[] args) {
        Color c1=FlyWeigthFactoryForColor.getColor("red");
        System.out.println(FlyWeigthFactoryForColor.colors.size());
        Color c2=FlyWeigthFactoryForColor.getColor("blue");
        System.out.println(FlyWeigthFactoryForColor.colors.size());
        Color c3=FlyWeigthFactoryForColor.getColor("blue");
        System.out.println(FlyWeigthFactoryForColor.colors.size());

    }
}
