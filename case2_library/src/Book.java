public class Book {
    public String title, isbn;
    public Author author;
    public boolean isAvailable;

    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public void displayBookInfo(){
        System.out.println("Title: " + (title.isBlank() ? "[no title]" : title));
        System.out.println("ISBN: " + (isbn.isBlank() ? "[no isbn]" : isbn));
        System.out.println("Author: " + (author.name.isBlank() ? "[no author name]" : author.name));
        System.out.println("Biography: " + (author.biography.isBlank() ? "[no author biography]" : author.biography));
        System.out.println("------------------------");
    }

    // public String getTitle(){ 
    //     if(title.isBlank()) return "[no title]";
    //     else return title;
    // }
}