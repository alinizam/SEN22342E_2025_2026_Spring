package Week03Theory.Example01;

public class Employee {
    private int mountlySalary[];
    static String departmentName;
    Employee(String departmentName){
        this.departmentName=departmentName;
    }
    Employee(int[] mountlySalary){
        this.mountlySalary = mountlySalary;
    }
    String name;
    class SalaryCalculate implements ISalary {

        @Override

        public int getTotalSalary() {
            int sum=0;
            for(int salary:mountlySalary) {
                sum+=salary;
            }
            return sum;
        }

        int salary;
    }
    static class Department{
        int id;
       void displayDeptName(){
           System.out.println(this.id);
           System.out.println(departmentName);
       }
    }
}
