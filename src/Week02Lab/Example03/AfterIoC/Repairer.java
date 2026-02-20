package Week02Lab.Example03.AfterIoC;



class Repairer {
    private ICar car;

    public Repairer(ICar car) {
        this.car = car;
    }

    public String repair() {
        return "Repairing " + car.getModel() + ". The car is now fixed.";
    }
}
