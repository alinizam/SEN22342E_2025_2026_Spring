package Week04Theory.Example04.CompositeBudget;

import java.util.ArrayList;

public class ManagementComposite implements DepartmentComponent {
    ArrayList<DepartmentComponent> subDepartments=new ArrayList<>();
    int budget;
    @Override
    public int getBudget() {
        int sum=this.budget;
        for (DepartmentComponent subDepartment : subDepartments) {
             sum += subDepartment.getBudget();
        }
        return sum;
    }

    @Override
    public void setBudget(int budget) {
        this.budget=budget;
    }

    void addSubDepartment(DepartmentComponent d){
        subDepartments.add(d);
    }
}
