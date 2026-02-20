package Week02Theory.Factory;

public class ProductFactory {
    static IProduct createProduct(String type){
        if (type.equals("PC")){
            return new PC();
        }else if (type.equals("Laptop")){
            return new Laptop();
        }else if (type.equals("Tablet")){
            return new Tablet();
        }
        else{
            throw new IllegalArgumentException("Invalid type");
        }
    }
}
