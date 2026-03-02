package Week03Theory.Example01;

public class TestNested {
    public static void main(String[] args) {
      //  Employee.SalaryCalculate calculateSalary = new Employee(new int[]{1000,2000,6000}).new SalaryCalculate();
        Employee e=new Employee(new int[]{1000,2000,6000});
        Employee.SalaryCalculate calculateSalary=e.new SalaryCalculate();
        System.out.println(calculateSalary.getTotalSalary() );
    }
}
