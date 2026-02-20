package Week02Lab.Example02.ViolationOfSingleResponsibility;

class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void repair() {
        System.out.println("Repairing " + model);
        checkParts();
        orderParts();
    }

    public void checkParts() {
        System.out.println("Checking parts for " + model);
    }

    public void orderParts() {
        System.out.println("Ordering parts for " + model);
    }

    public void saveToDatabase() {
        System.out.println("Saving " + model + " details to database.");
        updateRepairHistory();
    }

    public void updateRepairHistory() {
        System.out.println("Updating repair history for " + model);
    }

    public void sendNotification() {
        System.out.println("Sending repair notification for " + model);
        sendEmail();
        sendSMS();
    }

    public void sendEmail() {
        System.out.println("Sending email notification for " + model);
    }

    public void sendSMS() {
        System.out.println("Sending SMS notification for " + model);
    }
}
