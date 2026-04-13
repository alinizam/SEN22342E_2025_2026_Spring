package Week09Theory.Observer;

import java.awt.*;
import java.sql.SQLOutput;

public class Client {
    static void main() {
        ISubject button=new Subject();
        IObserver click=new Observer();
        button.addObserver(click);
        button.addObserver(()-> System.out.println("You clicked!"));
        button.notifyObservers();
    }
}
