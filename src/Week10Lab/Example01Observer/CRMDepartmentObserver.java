package Week10Lab.Example01Observer;

public class CRMDepartmentObserver implements DepartmentObserver{
    @Override
    public void update() {
        System.out.println("CRMDepartmentObserver update");
    }
}
