package Week05Lab.Example03FactoryDecorator;

public class Client {
    public static void main(String[] args) {
        FactoryDecorator f=new CarFactory() ;
        f.createCar("S");
        FactoryDecorator fSport=new SportCarFactoryDecorator(f) ;
        fSport.createCar("S");
    }
}
