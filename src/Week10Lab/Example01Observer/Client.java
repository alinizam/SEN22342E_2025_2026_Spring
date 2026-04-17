package Week10Lab.Example01Observer;

public class Client {
    static void main() {
        CallCenter callCenter = new CallCenter();
        callCenter.addObserver(new ITDepartmentObserver());
        callCenter.addObserver(new CRMDepartmentObserver());
        callCenter.addComplaint();
    }
}
