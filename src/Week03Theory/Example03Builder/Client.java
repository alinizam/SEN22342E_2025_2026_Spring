package Week03Theory.Example03Builder;


public class Client {
    public static void main(String[] args) {
        Employee e=new Employee.EmployeeBuilder().setName("Ahmet").build();
        System.out.println(e.name);
        Employee e1=new Employee.EmployeeBuilder().setId(1).setName("Mehmet").build();
        System.out.println(e1.name+" "+e1.id);
    }
}
