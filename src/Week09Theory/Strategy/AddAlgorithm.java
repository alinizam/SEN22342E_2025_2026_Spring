package Week09Theory.Strategy;

public class AddAlgorithm implements Algorithm{
    @Override
    public int operation(int a, int b) {
        return a+b;
    }
}
