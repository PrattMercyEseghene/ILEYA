import java.util.Scanner;
import java.util.ArrayList;
public class BookSystem{

    public static void main(String[]args){
    
        Scanner inputCollector = new Scanner(System.in);
    
        
        System.out.println("Welcome to the Book Suggestion System");
        System.out.println("1. Get Suggestion");
        System.out.println("2. AddBook");
        System.out.println("3. RemoveBook");
        System.out.println("4. Update book");
        System.out.println("5. Show all books");
        
        System.out.print("Enter operation: ");
        String operation = inputCollector.nextLine();

        if(operation.equals("2")){
        
            System.out.print("Enter the book title:");
            
            String title = inputCollector.nextLine();
            
            System.out.println(addBook(title));
            
        }
        else if(operation.equals("3")){
             System.out.println("Enter the book title to remove:");
             String title = inputCollector.nextLine();
             System.out.println(removeBook(title));
             
       }
       else if(operation.equals("4")){
           System.out.println("Enter the old title");
           String oldTitle = inputCollector.nextLine();
           System.out.println("Enter the new title");
           String newTitle = inputCollector.nextLine();
           System.out.println(updateBook(oldTitle, newTitle));
      }
      else if(operation.equals("5")){
        System.out.println("All Books");
      }
    }

    public static ArrayList<String> library = new ArrayList<>();
    
    public static String addBook(String bookName){
        if(library.contains(bookName)){ 
        
          return"book already exists";
        }
    
        library.add(bookName);
        return "book Added Successfully";
   }
   
   public static String removeBook(String bookName){
        if(library.contains(bookName)){
        
        library.remove(bookName);
 
        return"book Removed Successfully";
        }
        return "book does not exists";
        
   }
   
   public static String updateBook(String oldBook, String newBook){
   
        for (int index = 0; index < library.size(); index++){
        
           if (library.contains(oldBook)){
           
              library.set(index, newBook);
                return "books updated successfully";
            
            }
            
         }   
         return "book does not exist";}
}

// public static ArrayList<String> getBook(){
//    return library
// }
