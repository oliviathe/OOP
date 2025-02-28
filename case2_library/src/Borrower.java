import java.util.*;

public class Borrower{
    public String name;
    ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public Borrower(String name){
        this.name = name;
    }

    public void displayBorrowedBooks(){
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            book.displayBookInfo();
        }
        if(borrowedBooks.isEmpty()) System.out.println("No books borrowed...");
    }
}