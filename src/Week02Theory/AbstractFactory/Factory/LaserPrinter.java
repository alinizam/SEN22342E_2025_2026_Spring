package Week02Theory.AbstractFactory.Factory;

public class LaserPrinter implements IProduct {

    @Override
    public void sayType() {
        System.out.println("LaserPrinter");
    }
}
