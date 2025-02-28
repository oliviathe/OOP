import java.util.*;

public class Library{
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to library: " + book.title);
    }

    public void borrowBook(Borrower borrower, Book book){
        if(books.contains(book)){
            borrower.borrowedBooks.add(book);
            books.remove(book);
            System.out.println(borrower.name + " borowed: " + book.title);
        } else{
            System.out.println("Book is not available !");
        }
    }

    public void returnBook(Borrower borrower, Book book){
        if(borrower.borrowedBooks.contains(book)){
            borrower.borrowedBooks.remove(book);
            books.add(book);
            System.out.println(borrower.name + " returned: " + book.title);
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