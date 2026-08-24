import java.util.*;

record Movie(String title, String genre, int duration){}

record Booking(Movie movie, int tickets, double ticketPrice){
    public Booking {
        if (tickets <= 0)
            throw new IllegalArgumentException("Tickets must be positive");

        if (ticketPrice <= 0)
            throw new IllegalArgumentException("Ticket price must be positive");
    }

    public double calculateTotal(){
        double price = tickets * ticketPrice;
        return price;
    }

    public String bookingSummary(){
        return """
            Movie: %s
            Genre: %s
            Tickets: %d
            Total: %.1f
            """
            .formatted(movie.title(), movie.genre(), tickets, calculateTotal());
    }
}

public class MovieBookingSystem{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine(); 
        String genre = scan.nextLine();
        int duration = scan.nextInt();
        int tickets = scan.nextInt();
        double ticketPrice = scan.nextDouble();

        Movie movie = new Movie(title, genre, duration);
        Booking booking = new Booking(movie, tickets, ticketPrice);
        System.out.println(booking.bookingSummary());
    }
}