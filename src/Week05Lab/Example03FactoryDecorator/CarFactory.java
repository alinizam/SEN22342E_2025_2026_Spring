package Week05Lab.Example03FactoryDecorator;

public class CarFactory implements FactoryDecorator {
    @Override
    public Car createCar(String type) {
        if (type.equals("S")) {
            return new Sedan();

        }else{
            return new Sport();
        }
    }
}
