import java.util.*;

public class Borrower{
    private String name;
    private List<Book> borrowedBooks = new ArrayList<Book>();

    public Borrower(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void displayBorrowedBooks(){
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            book.displayBookInfo();
        }
        if(borrowedBooks.isEmpty()) System.out.println("No books borrowed...");
    }

    public Boolean hasBorrowedBook(Book book){
        return borrowedBooks.contains(book);
    }

    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book){
        borrowedBooks.remove(book);
    }
}