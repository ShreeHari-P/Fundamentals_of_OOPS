import java.util.*;

class Pilot{
    private String pilotName;

    public Pilot(String pilotName){
        this.pilotName = pilotName;
    }

    public String getPilotName(){return pilotName;}

    public String toString(){
        return "Pilot: Captain " + pilotName;
    }
}

class Seat{
    private String seats;
    
    public Seat(String seats){
        this.seats = seats;
    }

    public String getSeats(){return seats;}

    public String toString(){
        return seats;
     }
}

class Flight{
    private String flightNo;
    private Pilot pilot;
    private Seat[] seats;

    public Flight(String flightNo, Pilot pilot, int numSeats){
        this.flightNo = flightNo;
        this.pilot = pilot;
        this.seats = new Seat[numSeats];

        for(int i = 0; i < numSeats; i++){
            this.seats[i] = new Seat("Seat A"+(i+1));
        }
    }

    public String getInfo(){
        return "Flight: " + flightNo + "\n" +
                pilot.toString();
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < seats.length; i++){
            result += seats[i].toString() + "\n";
        }
        return result.trim();
    }
}

public class AirlineReservation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String pilotName = scan.nextLine();
        String flightNo = scan.nextLine();
        int seats = scan.nextInt();

        Pilot pilot = new Pilot(pilotName);
        Flight flight = new Flight(flightNo, pilot, seats);

        System.out.println(flight.getInfo());
        System.out.println();
        System.out.println(flight.toString());
        scan.close();
    }
}
