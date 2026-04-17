package Week10Lab.Example01Observer;

public class ITDepartmentObserver implements DepartmentObserver{
    @Override
    public void update() {
        System.out.println("ITDepartmentObserver update");
    }
}
