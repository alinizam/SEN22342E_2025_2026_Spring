package Week10Theory.NullObject;

public class Client {
    static void main() {
        Employee e=new NULLEmployee();
        Employee employees[]={new Staff(),new Staff(),new NULLEmployee()};
        int totalSalary=0;
        for(int i=0;i<employees.length;i++){
            totalSalary+=employees[i].getSalary();
        }
        System.out.println(totalSalary);
    }
}
