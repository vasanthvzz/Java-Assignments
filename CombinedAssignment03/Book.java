package CombinedAssignment03;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String ISBN;
    private String author;
    private int edition;
    private static List<Book> bookList = new ArrayList<>();
    Book(String title,String ISBN,String author , int edition){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.edition = edition;
        bookList.add(this);
    }

    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getISBN() { 
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }
    public static void showBooks(){
        for(Book book : bookList){
            System.out.printf("%-20s\t%-20s\t%s\n", book.getTitle(), book.getAuthor(), book.getISBN());
        }
    }

    public static void main(String[] args){
        new Book("One piece", "123-456-789", "Oda", 1);
        new Book("Attack on titan", "234-451-678", "Hajime isayama",4);
        new Book("Java", "245-234-233", "Thamarai selvam", 3);
        Book.showBooks();
    }
}
