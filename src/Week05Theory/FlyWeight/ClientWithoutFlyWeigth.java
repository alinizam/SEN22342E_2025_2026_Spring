package Week05Theory.FlyWeight;

public class ClientWithoutFlyWeigth {
    static void main() {
        Shape square=new Shape();
        square.color=new Color("blue");
        Shape rectangle=new Shape();
        rectangle.color=new Color("blue");
    }
}
