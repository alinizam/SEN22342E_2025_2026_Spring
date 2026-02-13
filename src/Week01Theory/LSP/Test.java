package Week01Theory.LSP;

public class Test {
    static void main() {
        Car s=new Sedan();
        IMove m=new Car();
        m.move();
    }
}
