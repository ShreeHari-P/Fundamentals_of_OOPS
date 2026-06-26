abstract class LibraryItem {
    String title;
    String author;

    public LibraryItem(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getInfo(){
        return title + " by " + author;
    }

    abstract String borrow();
}

interface Reservable{
    void reserve();
    void cancelReservation();
}

class Book extends LibraryItem implements Reservable{
    int pages;

    public Book(String title, String author,int pages){
        super(title, author);
        this.pages = pages;
    }

    @Override
    public String borrow(){
        return "Book borrowed " + title;
    }

    @Override
    public void reserve(){
        System.out.println("Book reserved");
    }

    @Override
    public void cancelReservation(){
        System.out.println("Reservation cancelled");
    } 
}

class Magazine extends LibraryItem{
    int issueNumber;

    public Magazine(String title, String author, int issueNumber){
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public String borrow(){
        return "Magazine borrowed: " + title;
    }
}

public class LibraryItems{
    public static void main(String[] args){

        Book myBook = new Book("Java Programming","James Gosling",121);
        Magazine myMagazine = new Magazine("Dopamine Detox","Robert",12);

        System.out.println(myBook.getInfo());
        System.out.println(myBook.borrow());

        System.out.println(myMagazine.getInfo());
        System.out.println(myMagazine.borrow());

        myBook.reserve();
        myBook.cancelReservation();
    }
}
