package Week02Lab.Example02.SolutionForSingleResponsibility;

public class InformationService {
    Vehicle vehicle;
    InformationService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void sendNotification() {
        System.out.println("Sending repair notification for " + vehicle.getModel());
        sendEmail();
        sendSMS();
    }

    public void sendEmail() {
        System.out.println("Sending email notification for " + vehicle.getModel());
    }

    public void sendSMS() {
        System.out.println("Sending SMS notification for " + vehicle.getModel());
    }
}
