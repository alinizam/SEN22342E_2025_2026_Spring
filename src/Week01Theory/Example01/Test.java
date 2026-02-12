package Week01Theory.Example01;

import Week01Theory.Example01.Car;

public class Test {
    static void main() {
        Car c=(SportCar)(new SportCar());

        ((SportCar)c).doubleSpeed();

        Factory f=new Factory();
        f.cars=new Car[]{new Car(), new SportCar(),new SportCar()};
        System.out.println(f.getTotalPrice());
        System.out.println(f.getAdditionalPriceofSportCar());
    }
}
