import java.util.Scanner;

public class LibraryBook {
    private String bookName;
    private boolean isIssued;

    public LibraryBook(String bookName){
        this.bookName = bookName;
        this.isIssued = false;
    }

    public void issuedBook(){
        if(!this.isIssued){
            isIssued = true;
            System.out.println("Book issued successfully");
        }else{
            System.out.println("Book is already issued");
        }
    }

    public void returnBook(){
        if(this.isIssued){
            this.isIssued = false;
            System.out.println("Book returned successfully");
        }else{
            System.out.println("Book was not issued");
        }
    }

    public String getStatus(){
        if(this.isIssued){
            return this.bookName + " is currently issued.";
        }else{
            return this.bookName + " is available";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Book Name: ");
        String bookName = sc.nextLine();

        LibraryBook book = new LibraryBook(bookName);

        int choice;

        do{
            System.out.println("\n1. Issued Book\n2. Returned Book\n3. Check Status\n4. Exit");
            choice = sc.nextInt();

            switch(choice){
                  case 1:
                    book.issuedBook();
                    break;
                case 2:
                    book.returnBook();
                    break;
                case 3:
                    System.out.println(book.getStatus());
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while (choice != 4);

        sc.close();
    }
}
