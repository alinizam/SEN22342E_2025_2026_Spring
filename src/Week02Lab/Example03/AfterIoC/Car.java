package Week02Lab.Example03.AfterIoC;

public class Car implements ICar {
    String model;
    Car(String model) {
       this.model = model;
    }
    @Override
    public String needsRepair() {
        return "Repaired";
    }

    @Override
    public String getModel() {
        return model;
    }
}
