package pack3;
/**
 * @author venkat
 * @apiNote interfaces for user and library operations
 * 
 * 
 * */
 interface user{
	 void login();
	 void logout();
 }
 /**
  * interface for library operations
  * */
 interface LibraryOperations {
	    void searchBook(String title);
	    void borrowBook(String title, String userId);
	    void returnBook(String title, String userId);
	}
