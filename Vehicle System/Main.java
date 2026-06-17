public class Main{
    public static void main(String[] args){

        Vehicle[] myVehicle = {
            new Car("Toyota",80),
            new Bike("Yamaha",60),
            new Train("Metro",100)
        };

        for(Vehicle vehi : myVehicle){
            vehi.move();
        }
    }
}