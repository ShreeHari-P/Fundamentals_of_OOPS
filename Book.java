import java.util.Scanner;

public class Book {
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void bookInfo(){
        System.out.println("The Book name is " + title + " and Written by " + author);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String title = scan.nextLine();
        String author = scan.nextLine();

        Book b = new Book(title, author);
        b.bookInfo();
        scan.close();        
    }
}
