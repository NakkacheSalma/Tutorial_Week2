// Subclass Journal
class Journal extends LibraryItem {
    private String field;
    public Journal(String title, String author, String field) {
        super(title, author); // Calls the constructor of the superclass
        this.field = field;
    }
    @Override
    public void getItemType(){
        System.out.println("Journal: ");
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls displayInfo() of superclass
        System.out.println("Field: " + field);
    }
}