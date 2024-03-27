package CombinedAssignment03.LibraryManagementClass;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    int id;
    Account account;
    List<Book> bookList = new ArrayList<>();
    public void verify(){}
    public void checkBook(){}
    public void getBookInfo(){}
}

class Account{
    private int borrowedBooksCount;
    private int reservedBooksCount;
    private int returnedBooksCount;
    private int lostBooksCount;
    private int fineAmount;
    public void calculateFine(){

    }
}