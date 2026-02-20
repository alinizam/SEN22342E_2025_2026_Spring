package Week02Theory.AbstractFactory.Factory;

public class PrinterFactory implements AbstractFactory {
    @Override
    public IProduct createProduct(String type) {
       IProduct product = null;
       if (type.equals("LaserPrinter")) {
           product = new LaserPrinter();
       } else if (type.equals("ThreeD")) {
           product=new ThreeD();
       }
       return product;
    }
}
