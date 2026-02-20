package Week02Lab.Example03.AfterIoC;

public class Test {
    public void main() {
        ICar c=new Car("Togg TX01");
        Repairer r=new Repairer(c);
        System.out.println(r.repair());

    }
}
