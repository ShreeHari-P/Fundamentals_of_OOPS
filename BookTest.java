import java.util.Objects;
import java.util.Scanner;

class Books{
    String isbn;
    String title;
    double price;

    public Books(String isbn, String title, double price){
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Books myBook = (Books) obj;
        return Objects.equals(isbn, myBook.isbn) && Objects.equals(title, myBook.title); 
    }

    @Override
    public int hashCode(){
        return Objects.hash(isbn, title);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Book1 isbn, title and price: ");
        String isbn1 = scan.nextLine();
        String title1 = scan.nextLine();
        double price1 = scan.nextDouble();

        scan.nextLine();
        System.out.println();
        System.out.println("Enter Book2 isbn, title and price: ");
        String isbn2 = scan.nextLine();
        String title2 = scan.nextLine();
        double price2 = scan.nextDouble();

        Books books1 = new Books(isbn1, title1, price1);
        Books books2 = new Books(isbn2, title2, price2);

        System.out.println("Equal: " + books1.equals(books2));
        System.out.println("Hash Equal: " + (books1.hashCode() == books2.hashCode()));
        scan.close();
    }
}
