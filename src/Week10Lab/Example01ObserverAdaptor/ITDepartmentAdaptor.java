package Week10Lab.Example01ObserverAdaptor;

public class ITDepartmentAdaptor implements DepartmentObserver {
    TechnicalServiceDepartment technicalServiceDepartment;
    ITDepartmentAdaptor(TechnicalServiceDepartment technicalServiceDepartment) {
        this.technicalServiceDepartment = technicalServiceDepartment;
    }
    @Override
    public void update() {
        technicalServiceDepartment.solve();
    }
}
