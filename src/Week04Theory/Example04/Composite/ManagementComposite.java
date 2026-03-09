package Week04Theory.Example04.Composite;

import java.util.ArrayList;

public class ManagementComposite implements DepartmentComponent {
    ArrayList<DepartmentComponent> subDepartments=new ArrayList<>();

    @Override
    public int getBudget() {
        int sum=0;
        for (DepartmentComponent subDepartment : subDepartments) {
             sum += subDepartment.getBudget();
        }
        return sum;
    }
    void addSubDepartment(DepartmentComponent d){
        subDepartments.add(d);
    }
}
