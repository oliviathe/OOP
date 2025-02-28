public class Book {
    private String title, isbn;
    private Author author;

    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public void displayBookInfo(){
        System.out.println("Title: " + (title.isBlank() ? "[no title]" : title));
        System.out.println("ISBN: " + (isbn.isBlank() ? "[no isbn]" : isbn));
        System.out.println("Author: " + (author.getName().isBlank() ? "[no author name]" : author.getName()));
        System.out.println("Biography: " + (author.getBiography().isBlank() ? "[no author biography]" : author.getBiography()));
        System.out.println("------------------------");
    }

    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }
    public Author getAuthor(){
        return author;
    }
}