package Week03Theory.Example02;

public class Employee {
    int salary;
    Employee(){

    }
    Employee(int salary) {
        this.salary = salary;
    }
    public Salary getSalary() {
        return new Salary(10000);
    }

    class Salary implements ISalary {
        int salary;
        Salary(int salary) {
            this.salary = salary;
        }
        void printSalary(){
            System.out.println(this.salary);
            System.out.println(Employee.this.salary);
        }
    }
}
