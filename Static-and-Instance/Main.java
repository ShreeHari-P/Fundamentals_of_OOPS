public class Main {
    public static void main(String[] args){
        LibraryBook b1 = new LibraryBook("Java Basics");
        LibraryBook b2 = new LibraryBook("Python Guide");
        LibraryBook b3 = new LibraryBook("Data Structures");

        b1.issueBook();
        b2.issueBook();
        b2.issueBook();

        b1.returnBook();
        b3.returnBook();

        b1.display();
        b2.display();
        b3.display();

        System.out.println("\n--- Library Stats ---");
        System.out.println("Total Books: " + LibraryBook.getTotalBooks());
        System.out.println("Issued Books: " + LibraryBook.getIssuedBooks());
        System.out.println("Available Books: " + LibraryBook.getAvailableBooks());
    }
}
