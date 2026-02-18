package Week01Theory.Example02LSP.LSP;

public class Test {
    static void main() {
        Car s=new Sedan();
        IMove m=new Car();
        m.move();
    }
}
