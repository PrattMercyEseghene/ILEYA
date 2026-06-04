import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookSystemTest{

    @Test
    public void testToAddBookToOurLibrary(){
        String bookName= "farmer's Pride";
        String expected= "book Added Successfully";
        String actual= BookSystem.addBook(bookName);
        assertEquals(expected, actual);
    }
    @Test
    public void testNotToAddBookToOurLibraryIfBookAlreadyExist(){
        String bookName = "farmer's pride";
        BookSystem.library.add(bookName);
        String expected = "book already exists";
        String actual = BookSystem.addBook(bookName);
        assertEquals(expected, actual);
        
    }
    @Test
    public void testToRemoveBookFromOurLibrary(){
    
        String bookName = "farmer's Pride";
        BookSystem.library.add(bookName);
        String expected = "book Removed Successfully";
        String actual = BookSystem.removeBook(bookName);
        assertEquals(expected, actual);
    }
    @Test
    public void testNotToRemoveBookFromOurLibraryIfBookDoesNotExist(){
        String bookName = "farmer's pride";
        String expected = "book does not exists";
        String actual = BookSystem.removeBook(bookName);
        assertEquals(expected, actual);
    }
    @Test
    public void testThatBookWasSuccessfullyUpdated(){
    
        BookSystem.library.add("farmer's bride");
        
        String bookName = "farmer's bride";
        String newBookName = "farmer's book";
        String expected = "books updated successfully";
        String actual   = BookSystem.updateBook(bookName, newBookName);
        assertEquals(expected, actual);
    }
    @Test
    public void testThatBookDoesNotExist(){
        
        String bookName = "farmer's bride";
        String newBookName = "farmer's book";
        String expected = "book does not exist";
        String actual   = BookSystem.updateBook(bookName, newBookName);
        assertEquals(expected, actual);
    }
   
}
