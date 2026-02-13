package Week01Theory.LSPGeneric;

import java.util.ArrayList;

public class Test {
    static void main1() {
        ArrayList cars=new ArrayList();
        cars.add(new Car(15));
        cars.add(new Car(20));
        cars.add("I am a real car");

        for (Object c:cars){
            if (c instanceof Car )System.out.println(((Car)c).price);
        }
    }

    static void main() {
        ArrayList<Car> cars=new ArrayList();
        cars.add(new Car(15));
        cars.add(new Car(20));

        for (Car c:cars){
            System.out.println(((Car)c).price);
        }
    }
}
