package Week02Lab.Example02.ViolationOfSingleResponsibility;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota");
        vehicle.repair();
        vehicle.saveToDatabase();
        vehicle.sendNotification();
    }
}

