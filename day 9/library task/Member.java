package pack3;
/**
 * @author venkat
 * @apiNote member class implementing multiple interfaces
 * 
 * */
class Member implements user, LibraryOperations {
    private String userId;
    private String name;
/**
 * constructor for member class
 * */
    public Member(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    /**
     * Getters and setters for user
     * */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println("Member " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Member " + name + " logged out.");
    }

    @Override
    public void searchBook(String title) {
     System.out.println("search for book");
    }
    @Override
    public void borrowBook(String title, String userId) {
            System.out.println("Book borrowed: " + title + " by user " + userId);
    }

    @Override
    public void returnBook(String title, String userId) {
 
            System.out.println("Book returned: " + title + " by user " + userId);
        }
    }

/**
 * Class for Librarian
 * */
class Librarian implements user, LibraryOperations {
    private String librarianId;
    private String name;

    public Librarian(String librarianId, String name) {
        this.librarianId = librarianId;
        this.name = name;
    }

    /**
     * Getters and setters for librarian
     * */
    public String getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  /**
   * methods for librarian implementing user
   * */
    @Override
    public void login() {
        System.out.println("Librarian " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Librarian " + name + " logged out.");
    }

    @Override
    public void searchBook(String title) {
    	System.out.println("searched for book");
    }
    
    @Override
    public void borrowBook(String title, String userId) {
        System.out.println("Librarians cannot borrow books.");
    }

    @Override
    public void returnBook(String title, String userId) {
        System.out.println("Librarians cannot return books.");
    }

 
}
