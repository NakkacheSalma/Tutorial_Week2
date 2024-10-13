// Subclass Book
class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, String genre) {
        super(title, author); // Calls the constructor of the superclass
        this.genre = genre;
    }

    @Override
    public void getItemType(){
        System.out.println("Book:");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls displayInfo() of superclass
        System.out.println("Genre: " + genre);
    }
}