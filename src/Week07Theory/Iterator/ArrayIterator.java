package Week07Theory.Iterator;

public class ArrayIterator {
    Object[] array;
    int index;
    public ArrayIterator(Object[] array) {
        this.array = array;
    }
    public boolean hasNext() {
        if (index < array.length) {
            return true;
        }
        return false;
    }
    public Object next() {
        if (hasNext()) {
            return array[index++];
        }else{
            System.out.println("End of the elemenents");
            return null;
        }
    }
}
