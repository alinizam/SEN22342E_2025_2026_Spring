package Week02Theory.AbstractFactory.Factory;

public class ClientWithFactory {
    public static void main(String[] args) {
        AbstractFactory factory = new PrinterFactory();
        IProduct p= factory.createProduct("LaserPrinter");
        p.sayType();
    }
}
