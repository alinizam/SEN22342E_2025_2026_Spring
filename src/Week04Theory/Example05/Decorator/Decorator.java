package Week04Theory.Example05.Decorator;

public abstract class Decorator implements IVehicleDecorator{
    IVehicleDecorator vehicle;
    public Decorator(IVehicleDecorator vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void increaseSpeed() {
       vehicle.increaseSpeed();
    }

    @Override
    public void sayVehicleAttributes() {
        vehicle.sayVehicleAttributes();
    }
}
