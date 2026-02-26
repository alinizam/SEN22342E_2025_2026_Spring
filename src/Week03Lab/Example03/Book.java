package Week03Lab.Example03;

public class Book implements Cloneable {
    String title;
    Book(String title) {

    }

    @Override
    protected Object clone()  {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
