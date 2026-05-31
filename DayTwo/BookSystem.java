import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Book {
    List<String> books = new ArrayList<>();


    public void addBook(String book) {
        if (books.contains(book)) {
            System.out.println("Book " + book + " already exist");
        }

        books.add(book);
    }


    public void removeBook(String book) {
        if (!books.contains(book)) {
            System.out.println("Book " + book + " does not exist");
        }

        books.remove(book);
    }

    public void updateBook(String book, String updatedBook) {
        if (!books.contains(book)) {
            System.out.println("Book " + book + " does not exist");
        }

        books.remove(book);
        books.add(updatedBook);
    }

    public List<String> getAllBooks() {
        return books;
    }

    public void getSuggestions() {
        int maxIndex = books.size();
        Random rand = new Random();
        int randomNumber = rand.nextInt(maxIndex);
        String randomBook = books.get(randomNumber);
        int pageNumber = rand.nextInt(100) + 1;

        System.out.println("Book Title: " + randomBook);
        System.out.println("Page: " + pageNumber);
    }

    public static void runApp(Book book){
        List<String> options = new ArrayList<>();
        options.add("Get Suggestions");
        options.add("Add Book");
        options.add("Remove Book");
        options.add("Update book ");
        options.add("Show all books");
        System.out.println("Welcome to the Book Suggestion System!");

        for (int i = 0; i < options.size(); i++) {
            System.out.println(i +1  + "   " + options.get(i));
        }

        System.out.print("Enter operation: ");
        Scanner scanner = new Scanner(System.in);
        String selected = scanner.nextLine();
        Scanner newScanner = new Scanner(System.in);

        switch (selected) {
            case "1":
                System.out.println("Book for the Day:");
                String selectedAns = "yes";
                while (selectedAns.equalsIgnoreCase("yes")) {
                    book.getSuggestions();
                    System.out.print("Would you like to get  another suggestion? (yes/no):");
                    selectedAns = newScanner.nextLine();
                }
                break;
            case "2":
                System.out.print("Enter the book title:");
                String bookTitle = newScanner.nextLine();
                book.addBook(bookTitle);
                System.out.println("Book added successfully!");
                break;
            case "3":
                System.out.print("Enter the book title to remove: ");
                String removeTitle = newScanner.nextLine();
                book.removeBook(removeTitle);
                System.out.println("Book removed successfully!");
                break;
            case "4":
                System.out.print("Enter the old title: ");
                String oldTitle = newScanner.nextLine();
                System.out.print("Enter the new title: ");
                Scanner scanner1 = new Scanner(System.in);
                String newTitle = scanner1.nextLine();
                book.updateBook(oldTitle, newTitle);
                System.out.print("\n");
                System.out.println("Book updated successfully!");
                break;
            case "5":
                System.out.println("All Books");
                List<String> allBooks = book.getAllBooks();
                for (int i = 0; i < allBooks.size(); i++) {
                    System.out.println(i + 1 + "   " + allBooks.get(i));
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    void main() {
        Book book = new Book();
        while (true) {
            runApp(book);
        }
    }
}
