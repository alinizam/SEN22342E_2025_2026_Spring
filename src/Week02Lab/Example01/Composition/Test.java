package Week02Lab.Example01.Composition;

public class Test {
    public static void main() {
        Vehicle car = new Car(new IColorBlue());
        car.sayYourColor();
        Vehicle car2 = new Bicycle(()-> System.out.println("I Have red color"));
        car2.sayYourColor();

    }
}
