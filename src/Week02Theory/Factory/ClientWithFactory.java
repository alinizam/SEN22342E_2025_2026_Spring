package Week02Theory.Factory;

import temp.Factory;

public class ClientWithFactory {
    public static void main(String[] args) {
        IProduct p=ProductFactory.createProduct("Laptop");
        p.sayType();
    }
}
