package Week07Lab.Example01CommmandPattern_WithRunnable;

import java.util.ArrayList;

public class Waiter {
    ArrayList<Runnable> orders = new ArrayList<Runnable>();
    void addOrder(Runnable command){
        orders.add(command);
    }
    void deliverOrder(){
        for(Runnable command : orders){
            command.run();
        }
    }
}
