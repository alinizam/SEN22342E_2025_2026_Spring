package Week10Lab.Example01ObserverAdaptor;

public class ReviewDepartmentAdaptor implements DepartmentObserver {
    ReviewDepartment reviewDepartment;
    public ReviewDepartmentAdaptor(ReviewDepartment reviewDepartment) {
        this.reviewDepartment = reviewDepartment;
    }
    @Override
    public void update() {
        reviewDepartment.examined();
    }
}
