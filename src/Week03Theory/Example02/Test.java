package Week03Theory.Example02;

import javax.swing.*;

public class Test {
    static void main() {
        Employee employee = new Employee();
        //Employee.Salary salary=new Employee().new Salary();
        //ISalary salary = new Employee().new Salary();
        Employee employee1 = new Employee();
        ISalary salary = employee1.getSalary();

        Employee employee2 = new Employee(5000);
        Employee.Salary salary1 = employee2.getSalary();
        System.out.println(employee2.salary);
        System.out.println(salary1.salary);
        salary1.printSalary();
    }


}
