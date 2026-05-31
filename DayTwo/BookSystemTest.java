import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void addBook() {
        String bookName = "Cat book";
        Book book = new Book();
        book.addBook(bookName);
        List<String> allBooks = book.getAllBooks();
        assertEquals(bookName, allBooks.getFirst());
    }

    @Test
    public void removeBook() {
        String catBook = "Cat book";
        String dogBook = "Dog book";
        Book book = new Book();
        book.addBook(catBook);
        book.addBook(dogBook);

        book.removeBook(dogBook);

        List<String> allBooks = book.getAllBooks();

        assertEquals(1, allBooks.size());
        assertEquals(catBook, allBooks.getFirst());
    }

    @Test
    public void updateBook() {
        String book1 = "Cat book";
        String book2 = "Dog book";
        Book book = new Book();
        book.addBook(book1);

        book.updateBook(book1, book2);

        List<String> allBooks = book.getAllBooks();
        assertEquals(book2, allBooks.getFirst());
    }

    @Test
    public void getAllBooks() {
        String catBook = "Cat book";
        String dogBook = "Dog book";
        Book book = new Book();
        book.addBook(catBook);
        book.addBook(dogBook);

        List<String> allBooks = book.getAllBooks();
        assertEquals(2, allBooks.size());

    }
}
