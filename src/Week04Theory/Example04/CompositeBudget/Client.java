package Week04Theory.Example04.CompositeBudget;

public class Client {
    static void main() {
        ManagementComposite management=new ManagementComposite(); //budget:20000
        management.setBudget(20000);
        management.addSubDepartment(new ITLeaf());
        management.addSubDepartment(new ITLeaf());
        management.addSubDepartment(new NormalDepartment());
        ManagementComposite subManagement=new ManagementComposite();//budget:10000
        management.addSubDepartment(subManagement);
        subManagement.setBudget(10000);
        subManagement.addSubDepartment(new ITLeaf());
        subManagement.addSubDepartment(new NormalDepartment());

        System.out.println(management.getBudget());
    }
}
