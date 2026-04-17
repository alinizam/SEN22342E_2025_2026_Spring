package Week10Lab.Example01ObserverAdaptor;

public class Client {
    static void main() {
        CallCenterSubject callCenter = new CallCenterSubject();
        callCenter.addObserver(new ITDepartmentObserver());
        callCenter.addObserver(new CRMDepartmentObserver());
        callCenter.addObserver(new ITDepartmentAdaptor(new TechnicalServiceDepartment()));
        callCenter.addObserver(new ReviewDepartmentAdaptor(new ReviewDepartment()));
        callCenter.addComplaint();
    }
}
