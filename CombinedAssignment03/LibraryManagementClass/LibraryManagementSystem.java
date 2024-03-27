package CombinedAssignment03.LibraryManagementClass;

import java.util.List;

enum userType{
    User,
    Librarian;
}
public class LibraryManagementSystem {
    private String userName;
    private String password;

    void login(){};
    void logout(){};
    void register(){};

    private static List<User> userList ;
    private static List<Book> bookList;
    private static Librarian librarian;
    
    
}
