import java.util.*;

enum TrainClass{
    GENERAL(150), SLEEPER(450), AC(1200);

    private final int price;

    private TrainClass(int price){
        this.price = price;
    }

    public int getPrice(){return price;}
}

class Passenger{
    private final String name;
    private final TrainClass trainClass;

    public Passenger(String name, TrainClass trainClass){
        this.name = name;
        this.trainClass = trainClass;
    }

    public String getName(){
        return name;
    }

    public String getPassenger(){
        return "Name: " + name +
                "\nClass: " + trainClass.name() +
                "\nFare: " + trainClass.getPrice();
    }
}

public class TrainTicketBooking{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String className = scan.nextLine().toUpperCase();

        TrainClass selectedClass = TrainClass.valueOf(className);
        Passenger passenger = new Passenger(name, selectedClass);

        System.out.println(passenger.getPassenger());
    }
}