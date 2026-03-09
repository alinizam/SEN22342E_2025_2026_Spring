package Week04Lab.Example01;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        IPayment payment = employee.getSalary();
        payment.paymentSalary(10,50);
        payment.paymentSalary(10,60);
        for (IPayment p:employee.payments){
            System.out.println(p);
        }
    }
}
