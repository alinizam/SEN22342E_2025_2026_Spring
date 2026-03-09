package Week04Theory.Example03;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.manager=employee;
        employee.manager.manager=employee;

        Manager manager = new Manager();
        manager.employees.add(employee);
        manager.employees.add(manager);
    }
}
