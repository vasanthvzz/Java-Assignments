public class BookDTO {
    private String title;
    private String ISBN;
    private String Author;
    private int edition;
    
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
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }

}
