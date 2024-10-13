public class Ebook extends LibraryItem {
    private String format;

    public Ebook(String title, String author, String format) {
        super(title, author); // Calls the constructor of the superclass
        this.format = format;
    }

    @Override
    public void getItemType(){
        System.out.println("Ebook:");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls displayInfo() of superclass
        System.out.println("Format: " + format);
    }

}
