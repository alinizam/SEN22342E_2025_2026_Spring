package Week02Lab.StringExplanation;

public class Test {
    public static void main() {
        String s=new String("Ahmet");
        System.out.println("Ahmet"==s);
        Car c=new Car();
        c.price=5000;
        System.out.println(c.price);
        changePrice(c);
        System.out.println(c.price);
        s="Ahmet";
        changeString(s);
        System.out.println(s);

    }
   static void changeString(String s){
        s="Mehmet";
    }
    static void changePrice(Car c){
        c.price=10000;
    }
}
