package Week03Lab.Example03;

public class Client {
    public static void main(String[] args) {
        Book book1_1 = BookPrototypeStore.getBookPrototype("Book 1");
        Book book1_2 = BookPrototypeStore.getBookPrototype("Book 1");
        System.out.println(book1_1==book1_2);
        User u1=new User();
        u1.book=book1_1;
        User u2=new User();
        u2.book=book1_1;

    }
}
