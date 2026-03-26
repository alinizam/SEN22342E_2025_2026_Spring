package Week07Lab.Example01CommmandPattern_1;

import java.util.ArrayList;

public class Waiter {
    ArrayList<Command> orders = new ArrayList<Command>();
    void addOrder(Command command){
        orders.add(command);
    }
    void deliverOrder(){
        for(Command command : orders){
            command.execute();
        }
    }
}
