package Week10Lab.Example01ObserverAdaptor;

public class CRMDepartmentObserver implements DepartmentObserver {
    @Override
    public void update() {
        System.out.println("CRMDepartmentObserver update");
    }
}
