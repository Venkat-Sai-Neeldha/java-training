package pack3;

public class Main {
    public static void main(String[] args) {
        // Create books
        Book fictionBook = new FictionBook("harry potter", "j.k.rowling");
        Book nonFictionBook = new NonFictionBook("evolution", "darwin");
        fictionBook.displayDetails();
        nonFictionBook.displayDetails();
        // Add books to the catalog
        Librarian librarian = new Librarian("lib1", "venkat");
        librarian.login();
        librarian.logout();

        // Member operations
        Member member = new Member("member1", "sai");
        member.login();
        member.borrowBook("evolution", "sai");
        member.returnBook("evolution", "sai");
        member.logout();

  
    }
}
