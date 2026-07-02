import java.util.Scanner;
import java.util.Objects;
import java.util.HashSet;

class Ticket{
    String ticketNumber;
    String passengerName;
    String flightNumber;
    String seatNumber;

    public Ticket(String ticketNumber, String passengerName, String flightNumber, String seatNumber){
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Ticket ticket = (Ticket) obj;
        return Objects.equals(ticketNumber, ticket.ticketNumber) &&
                Objects.equals(flightNumber, ticket.flightNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hash(ticketNumber, flightNumber);
    }

    @Override
    public String toString() {
        return "Ticket{" + "No='" + ticketNumber + '\'' + ", Flight='" + flightNumber + '\'' + '}';
    }
}

public class FlightReservation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        HashSet<Ticket> ticketSet = new HashSet<>();

        Ticket t1 = new Ticket("T123","Alice","AA100","12A");
        Ticket t2 = new Ticket("T123","Bob","AA100","14C");
        Ticket t3 = new Ticket("T456","Charlie","BB200","02B");

        ticketSet.add(t1);
        ticketSet.add(t2);
        ticketSet.add(t3);

        System.out.println("Total unique tickets: " + ticketSet.size());
    }
}
