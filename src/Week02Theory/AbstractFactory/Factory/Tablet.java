package Week02Theory.AbstractFactory.Factory;

public class Tablet implements IProduct {
    @Override
    public void sayType() {
        System.out.printf("Tablet");
    }
}
