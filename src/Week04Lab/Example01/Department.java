package Week04Lab.Example01;

import java.util.ArrayList;

public class Department {
    static ArrayList<Employee> employees = new ArrayList<>();
    static class EmployeeOperation{
        void addEmployee(Employee e,IPayment p){
            e.payments.add(p);
            employees.add(e);
        }
    }
    void getEmployeeExceedingAdvance(){
        for (Employee e:employees){
            int sumPayment = 0;
            for(IPayment p:e.payments){
                sumPayment+=p.getNet();
            }
            int sumAdvance = 0;
            for(IPayment p:e.advances){
                sumAdvance+=p.getNet();
            }
            if(sumPayment > sumAdvance){
                System.out.println(e.firstName+" "+e.lastName);
            }
        }
    }
}
