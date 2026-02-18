package Week01Theory.Example02LSP.LSP;

public class Car implements IMove{
    public int getPrice(){return 1000;}
    String getBrand(){return "Togg";}

    @Override
    public void move() {

    }
}
