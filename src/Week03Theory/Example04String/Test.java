package Week03Theory.Example04String;

public interface Test {
    static void main() {

        StringBuilder builder=new StringBuilder("Ahmet");
        for(int i=1;i<=100000000;i++) {
            builder.append("a");
        }
    /*   String name="Ahmet";
        for (int i = 0; i < 1000000; i++) {
            name=name+"a";
        }*/
       // System.out.println(name);
    }
}
