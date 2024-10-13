public class LibrarySystem {
    public static void main(String[] args) {
        // Creating an array of LibraryItem (polymorphism in action)
        LibraryItem[] items = new LibraryItem[4];
        // Implicit casting:
            // A Magazine object is assigned to a LibraryItem reference
        items[0] = new Book("1984", "George Orwell", "Dystopian");

        items[1] = new Magazine("National Geographic", "Various", 2023);

        items[2] = new Journal("IEEE Transactions", "John Doe",
                "Engineering");

        items[3] = new Ebook("Atomic Habit", "James Clear", "pdf");

        for (LibraryItem item : items) {
            item.displayInfo(); // Polymorphic call -> Java dynamically determines which displayInfo() to call
            System.out.println(); // For better readability

        }
    }
}