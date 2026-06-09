public class Main{
    public static void main(String[] args){
        
        Vehicle[] myVehicle = new Vehicle[3];

        myVehicle[0] = new Vehicle();
        myVehicle[1] = new Car();
        myVehicle[2] = new Bike();

        for(Vehicle vehicle : myVehicle){
            vehicle.startEngine();
        }

    }
}