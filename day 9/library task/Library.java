package pack3;
/**
 * @author venkat
 * @apiNote 
 * */
class LibraryCatalog {

    public static void addBook(Book book) {
        System.out.println("Book added: " + book.getTitle());
    }

    public static void updateBook(String title, String newAuthor) {
        
                System.out.println("Book updated: ");
    }

    public static void displayCatalog() {
        System.out.println("Library Catalog:");
 
    }

    public static Book findBook(String title) {
       System.out.println("found book");
	return null;
    }
    }
