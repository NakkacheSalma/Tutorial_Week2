// Subclass Magazine
class Magazine extends LibraryItem {
    private int issueNumber;
    public Magazine(String title, String author, int issueNumber) {
        super(title, author); // Calls the constructor of the superclass
        this.issueNumber = issueNumber;
    }
    @Override
    public void getItemType(){
        System.out.println("Magazine: ");
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls displayInfo() of superclass
        System.out.println("Issue Number: " + issueNumber);
    }
}