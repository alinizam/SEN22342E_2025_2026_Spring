package Week06Lab.Question1FlyWeigtComposite;

import java.util.function.Function;

public class AdditionalExample {

static void main(String[] args) {
    class c implements Runnable{
        @Override
        public void run() {
            System.out.println("Hello runnable");
        }
    }
    Runnable r=()-> System.out.println("Hello runnable");
    r.run();
    Function<Integer,String> f=(i)->"converted "+i.toString();
    System.out.println(f.apply(10));

}
}
