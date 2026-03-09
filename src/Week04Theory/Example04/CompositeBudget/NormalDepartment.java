package Week04Theory.Example04.CompositeBudget;

public class NormalDepartment implements DepartmentComponent {
    @Override
    public int getBudget() {
        return 5000;
    }

    @Override
    public void setBudget(int budget) {

    }
}
