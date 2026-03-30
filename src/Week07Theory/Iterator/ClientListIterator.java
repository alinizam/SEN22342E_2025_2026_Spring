package Week07Theory.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ClientListIterator {
    static void main() {
        ArrayList list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator li=list.listIterator(list.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
