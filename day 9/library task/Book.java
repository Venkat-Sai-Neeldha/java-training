package pack3;
/**
 * @author venkat
 * @apiNote class book for book details
 * */
abstract class Book {
	 private String title;
	    private String author;
        /**
         * @apiNote constructor for book class
         * */
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	  
	    }
        /**
         * gets title of book
         * */
	    // Getters and setters
	    public String getTitle() {
	        return title;
	    }

	    /**
	     * sets title of book
	     * */
	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }
	  

	    /** 
	     * Abstract method to display book details
	     * */
	    public abstract void displayDetails();
	}

	/** 
	 * Subclass for Fiction books
	 * */
	class FictionBook extends Book {
	    public FictionBook(String title, String author) {
	        super(title, author);
	    }

	    @Override
	    public void displayDetails() {
	        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor());
	    }
	}

	/** 
	 * Subclass for Non-fiction books*/
	class NonFictionBook extends Book {
	    public NonFictionBook(String title, String author) {
	        super(title, author);
	    }

	    @Override
	    public void displayDetails() {
	        System.out.println("Non-Fiction Book: " + getTitle() + " by " + getAuthor());
	    }
	}
