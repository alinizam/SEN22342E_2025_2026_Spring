package Week03Theory.Example01;

public class TestStaticNested {
    public static void main() {
        Employee e=new Employee("FSM");
        Employee.Department department=new Employee.Department();
        department.displayDeptName();
    }
}
