package Week02Lab.Example03.BeforeIoC;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String needsRepair() {
        return model + " needs repair.";
    }

    public String getModel() {
        return model;
    }
}


