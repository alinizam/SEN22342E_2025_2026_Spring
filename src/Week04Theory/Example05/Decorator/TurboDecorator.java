package Week04Theory.Example05.Decorator;

public class TurboDecorator extends Decorator {
    public TurboDecorator(IVehicleDecorator vehicleDecorator) {
        super(vehicleDecorator);
    }

    @Override
    public void increaseSpeed() {
        super.increaseSpeed();
        turboAddition();
    }

    @Override
    public void sayVehicleAttributes() {

    }

    void turboAddition() {
        System.out.println(" by turbo");
    }
}
