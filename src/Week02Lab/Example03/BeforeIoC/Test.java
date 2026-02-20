package Week02Lab.Example03.BeforeIoC;

public class Test {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        Repairer repairer = new Repairer(myCar);

        System.out.println(myCar.needsRepair());
        System.out.println(repairer.repair());
    }
}
