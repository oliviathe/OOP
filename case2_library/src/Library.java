import java.util.*;

public class Library{
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to library: " + book.getTitle());
    }

    public void borrowBook(Borrower borrower, Book book){
        if(books.contains(book)){
            borrower.addBorrowedBook(book);;
            books.remove(book);
            System.out.println(borrower.getName() + " borowed: " + book.getTitle());
        } else{
            System.out.println("Book is not available !");
        }
    }

    public void returnBook(Borrower borrower, Book book){
        if(borrower.hasBorrowedBook(book)){
            borrower.removeBorrowedBook(book);;
            books.add(book);
            System.out.println(borrower.getName() + " returned: " + book.getTitle());
        } else{
            System.out.println("Book was not borrowed !");
        }
    }

    public void displayLibraryBooks(){
        System.out.println("Books in Library:");
        for(Book book : books){
            book.displayBookInfo();
        }
        if(books.isEmpty()) System.out.println("No books available...");
    }
}