package Week02Lab.Example03.BeforeIoC;

class Repairer {
    private Car car;

    public Repairer(Car car) {
        this.car = car;
    }

    public String repair() {
        return "Repairing " + car.getModel() + ". The car is now fixed.";
    }
}
