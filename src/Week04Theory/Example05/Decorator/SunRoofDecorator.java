package Week04Theory.Example05.Decorator;

public class SunRoofDecorator extends Decorator {
    boolean sunRoof;

    public SunRoofDecorator(IVehicleDecorator vehicle) {
        super(vehicle);
    }


    @Override
    public void sayVehicleAttributes() {
        super.sayVehicleAttributes();
        System.out.println("with sunroof");
    }
}
