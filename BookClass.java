import java.util.Scanner;

public class BookClass {
    private String title, author;
    private int price;

    public BookClass(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getDetails(){
        return this.title + " by " + this.author + " costs ₹" + price; 
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Title of the Book: ");
        String title = scan.nextLine();
        System.out.print("Enter Author of the Book: ");
        String author = scan.nextLine();
        System.out.print("Enter the Price of the Book: ");
        int price = scan.nextInt();

        BookClass b = new BookClass(title, author, price);
        System.out.println(b.getDetails());
        scan.close();
    }
}

