package Week02Theory.Factory;

public class ClientwithoutFactory
{
    public static void main(String[] args)
    {
        String productType="Laptop";
        IProduct p=null;
        if (productType.equals("PC")){
            p=new PC();}
        else if (productType.equals("Laptop")){
            p=new Laptop();
        }
        p.sayType();
    }
}
