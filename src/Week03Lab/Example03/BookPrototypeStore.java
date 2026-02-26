package Week03Lab.Example03;

import java.util.HashMap;

public class BookPrototypeStore {
    static HashMap<String, Book> books = new HashMap<String, Book>();
    static {
        books.put("Book 1", new Book("Book 1"));
        books.put("Book 2", new Book("Book 2"));

    }
    static Book getBookPrototype(String title){
        Book book=(Book) books.get(title).clone();
        if(book instanceof Book){
            return book;
        }else {
            return null;
        }
    }
}
