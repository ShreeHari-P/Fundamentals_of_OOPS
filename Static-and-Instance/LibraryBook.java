public class LibraryBook {
    private String title;
    private boolean isIssued;

    private static int totalBooks;
    private static int issuedBooks;

    // Constructor
    public LibraryBook(String title) {
        this.title = title;
        this.isIssued = false;
        totalBooks++;
    }

    // Issue Book
    public void issueBook() {
        if (isIssued) {
            System.out.println(title + " is already issued!");
        } else {
            isIssued = true;
            issuedBooks++;
            System.out.println(title + " issued successfully.");
        }
    }

    // Return Book
    public void returnBook() {
        if (!isIssued) {
            System.out.println(title + " was not issued!");
        } else {
            isIssued = false;
            issuedBooks--;
            System.out.println(title + " returned successfully.");
        }
    }

    // Static Methods
    public static int getTotalBooks() {
        return totalBooks;
    }

    public static int getIssuedBooks() {
        return issuedBooks;
    }

    public static int getAvailableBooks() {
        return totalBooks - issuedBooks;
    }

    // Display Book Info
    public void display() {
        System.out.println("Book: " + title + " | Issued: " + isIssued);
    }
}
