package Week07Theory.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ClientArraylList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        for(String s:list){
            System.out.println(s);
        }
        Iterator i=list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        ArrayList<StringBuilder> listSB=new ArrayList();
        listSB.add(new StringBuilder("A"));
        listSB.add(new StringBuilder("B"));
        listSB.add(new StringBuilder("C"));
        for(StringBuilder s:listSB){
            listSB.remove(s);
            System.out.println(s);
        }
    }
}
