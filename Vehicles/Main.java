public class Main {

    public static void main(String[] args) {

        Vehicles[] myVehicle = {new Car(), new Bike(), new Bus()};

        for(Vehicles vehicle : myVehicle){
            System.out.println(vehicle.start());
            System.out.println(vehicle.stop());
        }
    }
}