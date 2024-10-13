// Superclass
class LibraryItem {
    // Private attribute: Only accessible through getters/setters
    private String title;
    private String author;

    // Constructor: Used to initialize the object with a title and author
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter: Allows external access to the private title attribute
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    // This method is overridden by subclasses to return the specific type of the item
    public void getItemType(){
        System.out.println("LibraryItem :"); //default type
    }

    // Method that will be overridden in subclasses to display item information
    public void displayInfo() {
        this.getItemType();
        System.out.println("Title: " + title + ", Author: " + author);
    }

}