class Vehicle {
    public void startEngine(){
        System.out.println("Vehicle engine starts");
    }
}

class Car extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Car engine starts with key");
    }
}   

class Bike extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Bike engine starts with self start");
    }
}
