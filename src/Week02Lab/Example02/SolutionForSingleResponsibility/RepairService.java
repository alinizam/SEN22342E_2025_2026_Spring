package Week02Lab.Example02.SolutionForSingleResponsibility;

public class RepairService {
    Vehicle vehicle;
    RepairService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void repair() {
        System.out.println("Repairing " + vehicle.getModel());
        checkParts();
        orderParts();
    }

    public void checkParts() {
        System.out.println("Checking parts for " + vehicle.getModel());
    }

    public void orderParts() {
        System.out.println("Ordering parts for " + vehicle.getModel());
    }

    public void updateRepairHistory() {
        System.out.println("Updating repair history for " + vehicle.getModel());
    }
    public void saveToDatabase() {
        System.out.println("Saving " + vehicle.getModel() + " details to database.");
        updateRepairHistory();
    }
}
