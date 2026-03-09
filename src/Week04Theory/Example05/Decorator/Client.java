package Week04Theory.Example05.Decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.increaseSpeed();
        System.out.println();
        IVehicleDecorator carDecorator=new TurboDecorator(car);
        carDecorator.increaseSpeed();
        IVehicleDecorator carDecorator2=new SunRoofDecorator(car);
        carDecorator2.sayVehicleAttributes();

    }
}
