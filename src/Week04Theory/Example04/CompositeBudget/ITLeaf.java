package Week04Theory.Example04.CompositeBudget;

public class ITLeaf implements DepartmentComponent {
    @Override
    public int getBudget() {
        return 10000;
    }

    @Override
    public void setBudget(int budget) {

    }
}
