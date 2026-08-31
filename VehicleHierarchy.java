import java.util.*;

sealed abstract class Vehicle permits Car, Bike, Truck{
    String brand;
    
    public Vehicle(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    abstract String startEngine();
}

final class Car extends Vehicle{
    public Car(String brand){
        super(brand);
    }

    public String startEngine(){
        return "Car " + getBrand() + " engine started";
    }
}

final class Bike extends Vehicle{
    public Bike(String brand){
        super(brand);
    }

    public String startEngine(){
        return "Bike " + getBrand() + " engine started";
    }
}

non-sealed class Truck extends Vehicle{
    public Truck(String brand){
        super(brand);
    }

    public String startEngine(){
        return "Truck " + getBrand() + " engine started";
    }
}

class VehicleHierarchy{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String carBrand = scan.nextLine();
        String bikeBrand = scan.nextLine();
        String truckBrand = scan.nextLine();

        Vehicle[] vehicles = {
            new Car(carBrand),
            new Bike(bikeBrand),
            new Truck(truckBrand)
        };

        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.startEngine());
        }
    }
}