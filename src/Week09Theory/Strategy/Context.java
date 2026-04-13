package Week09Theory.Strategy;

public class Context {
    int a,b;
    Context(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate(Algorithm algorithm){
       return algorithm.operation(a, b);
    }
}
