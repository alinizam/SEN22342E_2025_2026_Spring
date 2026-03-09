package Week04Theory.Example05.Decorator;
//Concreate Object
public class Car implements IVehicleDecorator {
    @Override
    public void increaseSpeed() {
        System.out.print("Car speed increased");
    }

    @Override
    public void sayVehicleAttributes() {
        System.out.println("Normal Car");
    }


}
