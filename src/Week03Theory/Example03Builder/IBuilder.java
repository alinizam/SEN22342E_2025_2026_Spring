package Week03Theory.Example03Builder;


public interface IBuilder {
    IBuilder setId(int id);
    IBuilder setSalary(int salary);
    IBuilder setName(String name);
    Employee build();
}
