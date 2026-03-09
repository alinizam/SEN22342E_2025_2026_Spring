package Week04Lab.Example01;

import java.util.ArrayList;

public class Employee {
    String firstName;
    String lastName;
    ArrayList<IPayment> payments = new ArrayList<IPayment>();
    ArrayList<IPayment> advances = new ArrayList<IPayment>();
    IPayment getSalary(){
        return new Salary(0,0);
    }
    class Salary implements IPayment {
        int net, tax;
        public Salary(int net, int tax) {
            this.net = net;
        }
        @Override
        public void paymentSalary(int net, int tax) {
            payments.add(new Salary(net,tax));
        }

        @Override
        public int getNet() {
            return net-tax;
        }
    }
}
