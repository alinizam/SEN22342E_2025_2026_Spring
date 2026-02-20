package Week02Theory.AbstractFactory.Factory;

public class Laptop implements IProduct {
    @Override
    public void sayType() {
        System.out.println("Laptop");
    }
}
