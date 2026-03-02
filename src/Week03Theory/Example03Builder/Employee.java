package Week03Theory.Example03Builder;
//Product in UML
public class Employee {
    int id,salary;
    String name;
    Employee(EmployeeBuilder iBuilder) {
        //this represents Employee
        this.id = iBuilder.id;
        this.salary = iBuilder.salary;
        this.name = iBuilder.name;
    }
    static class EmployeeBuilder implements IBuilder {
        int id,salary;
        String name;
        @Override
        public IBuilder setId(int id) {
            this.id = id;
            return this;
        }

        @Override
        public IBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        @Override
        public IBuilder setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public Employee build() {
            //this represents builder
            return new Employee(this);
        }
    }
}
