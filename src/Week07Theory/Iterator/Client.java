package Week07Theory.Iterator;

public class Client
{
    static void main() {
        ArrayIterator i=new ArrayIterator(new String[]{"A","B","C"});
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
